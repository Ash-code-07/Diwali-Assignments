package dao;

import beans.Student;
import java.util.List;

public interface DaoStudent {
    void saveStudentsToFile(List<Student> students);
    void displayStudentsFromFile();
}
