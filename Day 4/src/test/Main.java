package test;

import beans.Employee;

public class Main {
    public static void main(String[] args) {
        // Using no-argument constructor
        Employee e1 = new Employee();
        System.out.println(e1);
        System.out.println();

        // Using constructor with empID and empName
        Employee e2 = new Employee(101, "Ayush Jadhav");
        System.out.println(e2);
        System.out.println();

        // Using constructor with all arguments
        Employee e3 = new Employee(102, "Riya Sharma", "Team Lead");
        System.out.println(e3);
        System.out.println();

        // Demonstrating custom methods
        e3.promote("Project Manager");
        e3.displayGreeting();
    }
}
