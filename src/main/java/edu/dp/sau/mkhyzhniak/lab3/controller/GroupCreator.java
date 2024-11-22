package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Group;
import edu.dp.sau.mkhyzhniak.lab3.model.Student;

public class GroupCreator extends OrganizationCreator<Student> {
    private final StudentCreator studentCreator = new StudentCreator();

    public Group createGroup(int studentCount) {
        Group group = new Group();
        group.setName(randomCreator.generateGroupName());
        group.setHead(createHead());

        group.setContents(createContents(studentCount,
                studentCreator::createStudent
        ));

        return group;
    }

    public static void printGroupInfo(Group group) {
        System.out.println("\t\t\t-- Group --");
        System.out.println("\t\t\tName: " + group.getName());
        System.out.println("\t\t\tHead: " + group.getHead().getFirstName() + " " + group.getHead().getLastName());

        for (Student student : group.getContents()) {
            StudentCreator.printStudentInfo(student);
        }
    }
}
