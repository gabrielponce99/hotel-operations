package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchOut_after4Hours_addsFourHours() {
        //arrange
        Employee employee = new Employee("13584", "Tamara Smith", "Housekeeping", 0, 25.00);
        double expectedHours = 4;

        //act
        employee.punchIn(10);
        employee.punchOut(14);

        //assert
        assertEquals(expectedHours, employee.getHoursWorked());
    }

    @Test
    public void punchOut_from8Hours_gives10Hours() {
        Employee employee = new Employee("13584", "Tamara Smith", "Housekeeping", 8, 25.00);
        double expectedHours = 10;

        employee.punchIn(13);
        employee.punchOut(15);

        assertEquals(expectedHours, employee.getHoursWorked());

    }
}