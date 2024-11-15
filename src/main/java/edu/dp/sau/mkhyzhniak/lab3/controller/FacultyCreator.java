package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Faculty;
import edu.dp.sau.mkhyzhniak.lab3.model.Department;

public class FacultyCreator extends OrganizationCreator<Department> {
    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public Faculty createFaculty(int departmentCount, int groupCount, int studentCount) {
        Faculty faculty = new Faculty();
        faculty.setName(randomCreator.generateFacultyName());  // Генерує ім'я факультету
        faculty.setHead(createHead());                         // Генерує голову факультету

        // Створює кафедри за допомогою DepartmentCreator
        faculty.setContents(createContents(departmentCount,
                () -> departmentCreator.createDepartment(groupCount, studentCount)
        ));

        return faculty;
    }
}