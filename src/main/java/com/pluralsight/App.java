package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("king", 139.00, 2, true);
        Employee employee = new Employee("12346", "Tamara Smith", "Bar", 48, 27.65);
        Employee employee1 = new Employee("643216", "Samuel Clarkson", "Housekeeping", 0, 47.41);
        Room room = new Room(1, 139, true, true);
        Room room1 = new Room(1, 139, false, false);
        Room room2 = new Room(1, 139, true, false);
        Room room3 = new Room(1, 139, false, true);

        System.out.printf("Total stay: $%.2f", reservation.getReservationTotal());
        System.out.println();

        System.out.printf("Your paycheck is: $%.2f", employee.getTotalPay());
        System.out.println();

        System.out.println(room.isAvailable());
        System.out.println(room1.isAvailable());
        System.out.println(room2.isAvailable());
        System.out.println(room3.isAvailable());


        employee1.punchTimeCard(8);
        employee1.punchTimeCard(16);
        System.out.println(employee1.getHoursWorked());
        employee1.punchTimeCard(8);
        employee1.punchTimeCard(16);
        System.out.println(employee1.getHoursWorked());

    }
}
