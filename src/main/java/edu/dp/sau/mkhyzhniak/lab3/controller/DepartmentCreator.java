package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Department;
import edu.dp.sau.mkhyzhniak.lab3.model.Group;

public class DepartmentCreator extends OrganizationCreator<Group> {
    private final GroupCreator groupCreator = new GroupCreator();

    public Department createDepartment(int groupCount, int studentCount) {
        Department department = new Department();
        department.setName(randomCreator.generateDepartmentName());
        department.setHead(createHead());

        department.setContents(createContents(groupCount,
                () -> groupCreator.createGroup(studentCount)
        ));

        return department;
    }

    public static void printDepartmentInfo(Department department) {
        System.out.println("\t\t-- Department --");
        System.out.println("\t\tName: " + department.getName());
        System.out.println("\t\tHead: " + department.getHead().getFirstName() + " " + department.getHead().getLastName());

        for (Group group : department.getContents()) {
            GroupCreator.printGroupInfo(group);
        }
    }
}