package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Faculty;
import edu.dp.sau.mkhyzhniak.lab3.model.Department;

public class FacultyCreator extends OrganizationCreator<Department> {
    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public Faculty createFaculty(int departmentCount, int groupCount, int studentCount) {
        Faculty faculty = new Faculty();
        faculty.setName(randomCreator.generateFacultyName());
        faculty.setHead(createHead());

        faculty.setContents(createContents(departmentCount,
                () -> departmentCreator.createDepartment(groupCount, studentCount)
        ));

        return faculty;
    }

    public static void printFacultyInfo(Faculty faculty) {
        System.out.println("\t-- Faculty --");
        System.out.println("\tName: " + faculty.getName());
        System.out.println("\tHead: " + faculty.getHead().getFirstName() + " " + faculty.getHead().getLastName());

        for (Department department : faculty.getContents()) {
            DepartmentCreator.printDepartmentInfo(department);
        }
    }
}