package com.pluralsight;

public class Room {
    private int numberofBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberofBeds, double price, boolean occupied, boolean dirty) {
        this.numberofBeds = numberofBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberofBeds() {
        return numberofBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }
}
