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

    public static void printStudentInfo(Student student) {
        System.out.println("\t\t\t\t-- Student --");
        System.out.println("\t\t\t\tName: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("\t\t\t\tSex: " + student.getSex());
    }
}