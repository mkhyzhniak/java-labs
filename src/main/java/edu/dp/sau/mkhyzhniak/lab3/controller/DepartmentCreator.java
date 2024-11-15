package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Department;
import edu.dp.sau.mkhyzhniak.lab3.model.Group;

public class DepartmentCreator extends OrganizationCreator<Group> {
    private final GroupCreator groupCreator = new GroupCreator();

    public Department createDepartment(int groupCount, int studentCount) {
        Department department = new Department();
        department.setName(randomCreator.generateDepartmentName()); // Генерує ім'я кафедри
        department.setHead(createHead());                          // Генерує голову кафедри

        // Створює групи за допомогою GroupCreator
        department.setContents(createContents(groupCount,
                () -> groupCreator.createGroup(studentCount)
        ));

        return department;
    }
}