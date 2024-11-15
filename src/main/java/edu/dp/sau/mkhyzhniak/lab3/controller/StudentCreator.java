package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Student;

public class StudentCreator extends OrganizationCreator<Student> {
    public Student createStudent() {
        Student student = new Student();
        student.setFirstName(createHead().getFirstName());
        student.setLastName(createHead().getLastName());
        student.setPatronymic(createHead().getPatronymic());
        student.setSex(createHead().getSex());
        return student;
    }
}