package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("king", 139.00, 2, true);
        Employee employee = new Employee("12346", "Tamara Smith", "Bar", 48, 27.65);

        System.out.printf("Total stay: $%.2f", reservation.getReservationTotal());
        System.out.println();

        System.out.printf("Your paycheck is: $%.2f", employee.getTotalPay());

    }
}
