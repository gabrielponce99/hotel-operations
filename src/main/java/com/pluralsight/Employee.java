package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double hoursWorked;
    private double payRate;
    private double startTime;
    private boolean punchedIn;

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

    public void punchIn(int time) {
        startTime = time;
        punchedIn = true;
    }

    public void punchOut(int time) {
        hoursWorked += time - startTime;
        punchedIn = false;
    }

    public void punchIn() {
        startTime = getCurrentTime();
        punchedIn = true;
    }

    public void punchOut() {
        hoursWorked = hoursWorked + (getCurrentTime() - startTime);
        punchedIn = false;
    }

    private double getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.getHour() + (now.getMinute() / 60.0);
    }

    public void punchTimeCard(int time) {
        if (punchedIn) {
            hoursWorked += time - startTime;
            punchedIn = false;
        } else {
            startTime = time;
            punchedIn = true;
        }
    }

    public void punchTimeCard() {
        if (punchedIn) {
            punchOut();
        } else {
            punchIn();
        }
    }
}
