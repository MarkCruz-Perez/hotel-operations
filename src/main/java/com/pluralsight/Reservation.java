package com.pluralsight;


public class Reservation {

    // Attributes
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights,
                       boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    // Getters and Setters
    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("king") ||
                roomType.equalsIgnoreCase("double")) {
            this.roomType = roomType;
        }
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return this.weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    // Derived getter: calculate price per night
    public double getPrice() {
        double price;

        if (this.roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else {
            price = 124.00;
        }

        // Add 10% if the stay includes a weekend
        if (this.weekend) {
            price = price * 1.10;
        }

        return price;
    }

    // Derived getter: calculate reservation total
    public double getReservationTotal() {
        return getPrice() * this.numberOfNights;
    }
}

