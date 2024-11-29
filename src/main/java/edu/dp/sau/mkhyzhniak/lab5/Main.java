package edu.dp.sau.mkhyzhniak.lab5;

import edu.dp.sau.mkhyzhniak.lab5.controller.StudentController;
import edu.dp.sau.mkhyzhniak.lab5.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();

        System.out.println("=== All Students ===");
        List<Student> allStudents = controller.getAllStudents();
        controller.printStudents(allStudents);

        System.out.println("\n=== Students Born in March ===");
        List<Student> marchStudents = controller.getStudentsByMonth(3);
        controller.printStudents(marchStudents);
    }
}
