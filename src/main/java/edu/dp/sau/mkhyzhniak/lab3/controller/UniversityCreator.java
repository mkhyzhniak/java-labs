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
}