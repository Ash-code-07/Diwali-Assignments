package service;

import beans.Student;
import java.util.List;

public interface StudentService {
    void inputStudentData(List<Student> students);
    void calculateGrade(Student student) throws AttendanceLowException;
}
