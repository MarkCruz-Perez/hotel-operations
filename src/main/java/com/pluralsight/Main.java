package com.pluralsight;



public class Main {

    public static void main(String[] args) {

        // =========================
        // TEST ROOM CLASS
        // =========================

        Room room = new Room(2, 124.00, false, false);

        System.out.println("===== ROOM INFORMATION =====");
        System.out.println("Number of beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());


        // =========================
        // TEST RESERVATION CLASS
        // =========================

        Reservation reservation =
                new Reservation("king", 3, true);

        System.out.println("\n===== RESERVATION INFORMATION =====");
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Number of nights: "
                + reservation.getNumberOfNights());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Price per night: $"
                + reservation.getPrice());
        System.out.println("Reservation total: $"
                + reservation.getReservationTotal());


        // =========================
        // TEST EMPLOYEE CLASS
        // =========================

        Employee employee = new Employee(
                "1001",
                "John Smith",
                "Housekeeping",
                20.00,
                45
        );

        System.out.println("\n===== EMPLOYEE INFORMATION =====");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Pay rate: $" + employee.getPayRate());
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: $" + employee.getTotalPay());
    }
}



