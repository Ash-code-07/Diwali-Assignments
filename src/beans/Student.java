package beans;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String sName;
    private String course;
    private double attendancePercentage;
    private double score;
    private String grade;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(int rollNo, String sName, String course, double attendancePercentage, double score) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.course = course;
        this.attendancePercentage = attendancePercentage;
        this.score = score;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", course='" + course + '\'' +
                ", attendancePercentage=" + attendancePercentage +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }
}
