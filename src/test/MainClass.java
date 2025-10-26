package test;

import java.util.ArrayList;
import java.util.List;

import beans.Student;
import dao.DaoStudent;
import dao.DaoStudentImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class MainClass {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        StudentService service = new StudentServiceImpl();
        DaoStudent dao = new DaoStudentImpl();

        // Take input of 10 students
        service.inputStudentData(studentList);

        // Save students to file
        dao.saveStudentsToFile(studentList);

        // Display students from file
        dao.displayStudentsFromFile();
    }
}
