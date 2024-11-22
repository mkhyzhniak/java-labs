package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.University;
import edu.dp.sau.mkhyzhniak.lab3.model.Faculty;

public class UniversityCreator extends OrganizationCreator<Faculty> {
    private final FacultyCreator facultyCreator = new FacultyCreator();

    public University createUniversity(int facultyCount, int departmentCount, int groupCount, int studentCount) {
        University university = new University();
        university.setName(randomCreator.generateUniversityName());
        university.setHead(createHead());

        university.setContents(createContents(facultyCount,
                () -> facultyCreator.createFaculty(departmentCount, groupCount, studentCount)
        ));

        return university;
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

        for (Faculty faculty : university.getContents()) {
            FacultyCreator.printFacultyInfo(faculty);
        }
    }
}