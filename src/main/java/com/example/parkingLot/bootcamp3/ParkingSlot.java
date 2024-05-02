package com.example.parkingLot.bootcamp3;

public class ParkingSlot {
    String parkingSlotNumber;
    Car car;
    boolean IsOccupied;
    String ticketID;

    public ParkingSlot(Car car, String parkingSlotNumber, boolean isOccupied, String ticketID) {
        this.car = car;
        this.parkingSlotNumber = parkingSlotNumber;
        this.IsOccupied = isOccupied;
        this.ticketID = ticketID;
    }

    public String getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(String parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public boolean isOccupied() {
        return IsOccupied;
    }

    public void setOccupied(boolean occupied) {
        IsOccupied = occupied;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}