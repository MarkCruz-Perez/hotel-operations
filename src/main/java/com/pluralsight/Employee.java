package com.pluralsight;

public class Employee {

    // Attribute
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(String employeeId, String name,
                    String department, double payRate,
                    double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    // Derived getter: regular hours (up to 40)
    public double getRegularHours() {
        return Math.min(this.hoursWorked, 40);
    }

    // Derived getter: overtime hours (over 40)
    public double getOvertimeHours() {
        return Math.max(this.hoursWorked - 40, 0);
    }

    // Derived getter: calculate total pay
    public double getTotalPay() {
        double regularPay = getRegularHours() * this.payRate;
        double overtimePay = getOvertimeHours()
                * this.payRate * 1.5;

        return regularPay + overtimePay;
    }
}



