package beans;

import java.io.Serializable;

public class Employee1 implements Serializable {
    private int empID;
    private String empName;
    private String empRole;

    // Constructors
    public Employee1() {
        this.empID = 0;
        this.empName = "Unknown";
        this.empRole = "Not Assigned";
    }

    public Employee1(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Software Developer"; // hardcoded
    }

    public Employee1(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    // toString() override
    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }
}
