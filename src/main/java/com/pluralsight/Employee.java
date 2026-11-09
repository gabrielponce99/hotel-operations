package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double hoursWorked;
    private double payRate;

    public Employee(String employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getRegularHours() {
        if (this.hoursWorked > 40) {
            return 40;
        }
        return this.hoursWorked;
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        return 0;
    }

    public double getTotalPay() {
        return (getRegularHours() * this.payRate) + (getOvertimeHours() * (payRate * 1.5));
    }
}
