package service;

import java.util.List;
import java.util.Scanner;

import beans.Student;

public class StudentServiceImpl implements StudentService {

    Scanner sc = new Scanner(System.in);

    @Override
    public void inputStudentData(List<Student> students) {
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            System.out.print("Score: ");
            double score = sc.nextDouble();

            Student s = new Student(roll, name, course, attendance, score);

            try {
                calculateGrade(s);
                students.add(s);
            } catch (AttendanceLowException e) {
                System.out.println( e.getMessage());
            }
        }
    }

    @Override
    public void calculateGrade(Student s) throws AttendanceLowException {
        if (s.getAttendancePercentage() < 60) {
            throw new AttendanceLowException("Attendance below 60% for Roll No: " + s.getRollNo());
        }

        double score = s.getScore();
        String grade;

        if (score >= 90) grade = "A+";
        else if (score >= 80) grade = "A";
        else if (score >= 70) grade = "B";
        else if (score >= 60) grade = "C";
        else grade = "D";

        s.setGrade(grade);
    }
}
