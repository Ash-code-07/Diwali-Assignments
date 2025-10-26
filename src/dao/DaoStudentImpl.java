package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import beans.Student;

public class DaoStudentImpl implements DaoStudent {

    private static final String FILE_NAME = "students.ser";

    @Override
    public void saveStudentsToFile(List<Student> students) {
        // Sort students by decreasing attendance
        students.sort((s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("\n 10 Students saved successfully to file: " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayStudentsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Student> students = (List<Student>) ois.readObject();
            System.out.println("\n Students from file (sorted by attendance):");
            students.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
