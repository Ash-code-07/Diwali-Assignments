package test;

import java.util.*;

import beans.Employee1;

import java.io.*;

public class EmployeeManager {
    private static ArrayList<Employee1> employeeList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Employee Management Menu =====");
            System.out.println("1. Add Employee to list");
            System.out.println("2. Remove Employee from list");
            System.out.println("3. Show all Employees");
            System.out.println("4. Show all Employees (sorted by empID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save all Employees into file");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    showAllEmployees();
                    break;
                case 4:
                    showSortedEmployees();
                    break;
                case 5:
                    findEmployeeByName();
                    break;
                case 6:
                    saveEmployeesToFile();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 7);
    }

    // 1️⃣ Add Employee
    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Role: ");
        String role = sc.nextLine();

        employeeList.add(new Employee1(id, name, role));
        System.out.println("✅ Employee added successfully!");
    }

    // 2️⃣ Remove Employee
    private static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();

        boolean removed = employeeList.removeIf(emp -> emp.getEmpID() == id);

        if (removed)
            System.out.println("✅ Employee removed successfully!");
        else
            System.out.println("❌ Employee not found!");
    }

    // 3️⃣ Show All Employees
    private static void showAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the list.");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (Employee1 e : employeeList) {
            System.out.println(e);
        }
    }

    // 4️⃣ Show Sorted Employees
    private static void showSortedEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }

        ArrayList<Employee1> sortedList = new ArrayList<>(employeeList);
        sortedList.sort(Comparator.comparingInt(Employee1::getEmpID));

        System.out.println("\n--- Sorted Employee List (by ID) ---");
        for (Employee1 e : sortedList) {
            System.out.println(e);
        }
    }

    // 5️⃣ Find Employee by Name
    private static void findEmployeeByName() {
        System.out.print("Enter employee name to search: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Employee1 e : employeeList) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                System.out.println("✅ Employee found: " + e);
                found = true;
            }
        }
        if (!found)
            System.out.println("❌ Employee not found!");
    }

    // 6️⃣ Save Employees to File
    private static void saveEmployeesToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            out.writeObject(employeeList);
            System.out.println("✅ All employees saved to file successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error saving employees: " + e.getMessage());
        }
    }
}
