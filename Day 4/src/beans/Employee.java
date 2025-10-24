package beans;

public class Employee {
    // Member variables
    private String empName;
    private int empID;
    private String empRole;

    // 🔹 No-argument constructor
    public Employee() {
        this.empID = 0;
        this.empName = "Unknown";
        this.empRole = "Not Assigned";
    }

    // 🔹 Constructor that accepts empID and empName (empRole is hardcoded)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Software Developer"; // Hardcoded role
    }

    // 🔹 Constructor that accepts empID, empName, and empRole
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // 🔹 Overriding toString() method
    @Override
    public String toString() {
        return "Employee Details: " +
               "\nID: " + empID +
               "\nName: " + empName +
               "\nRole: " + empRole;
    }

    // 🔹 Example of other methods (of your choice)
    public void promote(String newRole) {
        this.empRole = newRole;
        System.out.println(empName + " has been promoted to " + empRole);
    }

    public void displayGreeting() {
        System.out.println("Hello, " + empName + "! Welcome to the team as a " + empRole + ".");
    }

    // 🔹 Getters and setters (optional, for access)
    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpRole() {
        return empRole;
    }
}
