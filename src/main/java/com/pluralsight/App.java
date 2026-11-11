package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("king", 139.00, 2, true);
        Employee employee = new Employee("12346", "Tamara Smith", "Bar", 48, 27.65);
        Employee employee1 = new Employee("643216", "Samuel Clarkson", "Housekeeping", 0, 25.41);

        System.out.printf("Total stay: $%.2f", reservation.getReservationTotal());
        System.out.println();

        System.out.printf("Your paycheck is: $%.2f", employee.getTotalPay());
        System.out.println();

        Room room = new Room(1, 139, false, false);

        System.out.println("At start: " + room.isAvailable());

        room.checkIn();
        System.out.println("After check in: " + room.isAvailable());

        room.checkOut();
        System.out.println("After check out: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After clean room: " + room.isAvailable());


        employee1.punchIn();
        employee1.punchOut();
        System.out.println("Hours after punching in and out: " + employee1.getHoursWorked());

        employee1.punchTimeCard(8);
        employee1.punchTimeCard(16);
        System.out.println("Hours after punching in and out: " + employee1.getHoursWorked());

        Hotel hotel = new Hotel("Lakeside Inn", 2, 10);

        System.out.println("Book 2 suites: " + hotel.bookRoom(2,true));
        System.out.println("Book 1 more suite: " + hotel.bookRoom(1, true));
        System.out.println("Available suites: " + hotel.getAvailableSuites());


    }
}
