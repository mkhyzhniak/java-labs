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
}
