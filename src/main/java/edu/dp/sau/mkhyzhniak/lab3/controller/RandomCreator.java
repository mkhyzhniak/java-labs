package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Sex;

import java.util.List;
import java.util.Random;

public class RandomCreator {
    private final Random random = new Random();

    // Списки значень
    private static final List<String> FIRST_NAMES = List.of("John", "Emily", "Michael", "Sarah", "Robert", "Jessica");
    private static final List<String> LAST_NAMES = List.of("Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia");

    private static final List<String> GROUP_NAMES = List.of(
            "Group A", "Group B", "Group C", "Group D"
    );

    private static final List<String> UNIVERSITY_NAMES = List.of(
            "Harvard University", "Stanford University", "Massachusetts Institute of Technology"
    );
    private static final List<String> FACULTY_NAMES = List.of(
            "School of Engineering", "School of Medicine", "School of Business"
    );
    private static final List<String> DEPARTMENT_NAMES = List.of(
            "Computer Science Department", "Physics Department", "Economics Department"
    );


    public String generateFirstName() {
        return FIRST_NAMES.get(random.nextInt(FIRST_NAMES.size()));
    }

    public String generateLastName() {
        return LAST_NAMES.get(random.nextInt(LAST_NAMES.size()));
    }

    public Sex generateSex() {
        return random.nextBoolean() ? Sex.MALE : Sex.FEMALE;
    }

    public String generateUniversityName() {
        return UNIVERSITY_NAMES.get(random.nextInt(UNIVERSITY_NAMES.size()));
    }

    public String generateFacultyName() {
        return FACULTY_NAMES.get(random.nextInt(FACULTY_NAMES.size()));
    }

    public String generateDepartmentName() {
        return DEPARTMENT_NAMES.get(random.nextInt(DEPARTMENT_NAMES.size()));
    }

    public String generateGroupName() {
        return GROUP_NAMES.get(random.nextInt(GROUP_NAMES.size()));
    }
}