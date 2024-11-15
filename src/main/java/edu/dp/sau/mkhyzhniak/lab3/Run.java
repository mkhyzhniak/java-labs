package edu.dp.sau.mkhyzhniak.lab3;

import edu.dp.sau.mkhyzhniak.lab3.model.*;
import edu.dp.sau.mkhyzhniak.lab3.controller.*;


import java.util.Set;

    public class Run {

        public static void main(String[] args) {
            University university = createTypicalUniversity();

            printUniversityInfo(university);
        }

        public static University createTypicalUniversity() {
            UniversityCreator universityCreator = new UniversityCreator();

            int facultyCount = 2;
            int departmentCount = 2;
            int groupCount = 2;
            int studentCount = 5;

            return universityCreator.createUniversity(facultyCount, departmentCount, groupCount, studentCount);
        }

        public static void printUniversityInfo(University university) {
            System.out.println("=== University ===");
            System.out.println("Name: " + university.getName());
            System.out.println("Head: " + university.getHead().getFirstName() + " " + university.getHead().getLastName());

            Set<Faculty> faculties = university.getContents();
            for (Faculty faculty : faculties) {
                printFacultyInfo(faculty);
            }
        }

        private static void printFacultyInfo(Faculty faculty) {
            System.out.println("\t" + "-- Faculty --");
            System.out.println("\t" + "Name: " + faculty.getName());
            System.out.println("\t" + "Head: " + faculty.getHead().getFirstName() + " " + faculty.getHead().getLastName());

            Set<Department> departments = faculty.getContents();
            for (Department department : departments) {
                printDepartmentInfo(department);
            }
        }

        private static void printDepartmentInfo(Department department) {
            System.out.println("\t\t" + "-- Department --");
            System.out.println("\t\t" + "Name: " + department.getName());
            System.out.println("\t\t" + "Head: " + department.getHead().getFirstName() + " " + department.getHead().getLastName());

            Set<Group> groups = department.getContents();
            for (Group group : groups) {
                printGroupInfo(group);
            }
        }

        private static void printGroupInfo(Group group) {
            System.out.println("\t\t\t" + "-- Group --");
            System.out.println("\t\t\t" + "Name: " + group.getName());
            System.out.println("\t\t\t" + "Head: " + group.getHead().getFirstName() + " " + group.getHead().getLastName());

            Set<Student> students = group.getContents();
            for (Student student : students) {
                printStudentInfo(student);
            }
        }

        private static void printStudentInfo(Student student) {
            System.out.println("\t\t\t\t" + "-- Student --");
            System.out.println("\t\t\t\t" + "Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("\t\t\t\t" + "Sex: " + student.getSex());
        }
    }