package com.example.parkingLot.bootcamp3.Service;

import com.example.parkingLot.bootcamp3.Car;
import com.example.parkingLot.bootcamp3.ParkingSlot;

import java.time.LocalDateTime;

public class ParkingService {

    public boolean parkCar(Car car, ParkingSlot parkslot){
        if(parkslot.isOccupied())
            return false;

        parkslot.setCar(car);
        parkslot.setParkingSlotNumber("TW123");
        parkslot.setOccupied(true);
        parkslot.setTicketID(car.getRegistrationNumber() + LocalDateTime.now().toString());
        return true;
    }
}
