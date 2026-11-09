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

    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public int getNumberOfBeds() {
        return numberOfBeds.length();
    }
}
