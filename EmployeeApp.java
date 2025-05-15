/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeapp;

/**
 *
 * @author alfaraon
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}// Employee.java
public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;

    // Getters and setters
}

// Attendance.java
public class Attendance {
    private int attendanceId;
    private Employee employee;
    private Date date;
    private Time timeIn;
    private Time timeOut;

    // Getters and setters
}

// Payroll.java
public class Payroll {
    private int payrollId;
    private Employee employee;
    private String payPeriod;
    private double grossPay;
    private double deductions;
    private double netPay;

    // Getters and setters
}

// Leave.java
public class Leave {
    private int leaveId;
    private Employee employee;
    private String leaveType;
    private Date startDate;
    private Date endDate;

    // Getters and setters
}

