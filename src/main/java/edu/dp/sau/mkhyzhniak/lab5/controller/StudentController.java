package edu.dp.sau.mkhyzhniak.lab5.controller;

import edu.dp.sau.mkhyzhniak.lab5.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private final DBConnection dbConnection = new DBConnection();

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";
        Connection connection;

        try {
            connection = dbConnection.connect();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            students = processResultSet(resultSet);

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error fetching all students: " + e.getMessage());
        } finally {
            dbConnection.disconnect();
        }

        return students;
    }

    public List<Student> getStudentsByMonth(int month) {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students WHERE MONTH(birth_date) = ?";
        Connection connection;

        try {
            connection = dbConnection.connect();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            students = processResultSet(resultSet);

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error fetching students by month: " + e.getMessage());
        } finally {
            dbConnection.disconnect();
        }

        return students;
    }

    private List<Student> processResultSet(ResultSet resultSet) throws SQLException {
        List<Student> students = new ArrayList<>();

        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setFirstName(resultSet.getString("first_name"));
            student.setLastName(resultSet.getString("last_name"));
            student.setPatronymic(resultSet.getString("patronymic"));
            student.setBirthDate(resultSet.getDate("birth_date"));
            student.setRecordBookNumber(resultSet.getString("record_book_number"));
            students.add(student);
        }

        return students;
    }

    public void printStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() + " " + student.getPatronymic());
                System.out.println("Birth Date: " + student.getBirthDate());
                System.out.println("Record Book Number: " + student.getRecordBookNumber());
                System.out.println("-------------------------");
            }
        }
    }
}