package com.pluralsight;

public class Room {
    private String numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public boolean isAvailable() {

        //--fancy oneliner
        if(dirty == false && occupied == false) {
            return true;
        }
        return false;
    }
    public Room(int numberOfBeds, double price, boolean occupied,
    boolean dirty) {
        this.numberOfBeds = Integer.toString(numberOfBeds);
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public int getNumberOfBeds() {
        return numberOfBeds.length();
    }
    public boolean isDirty() {
        return this.dirty;
    }



}
