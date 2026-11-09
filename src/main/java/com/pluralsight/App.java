package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room = new Room(2, 125.00, false, false);

        System.out.println(room.isAvailable());
        System.out.println(room.getNumberofBeds());
        System.out.println(room.getPrice());

    }
}
