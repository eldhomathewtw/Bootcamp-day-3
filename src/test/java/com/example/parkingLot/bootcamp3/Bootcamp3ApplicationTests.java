package com.example.parkingLot.bootcamp3;

import com.example.parkingLot.bootcamp3.Service.ParkingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Bootcamp3ApplicationTests {

	@Test
	void parkCartest() {

		Car car = new Car("TN123");
		ParkingSlot psrkingslot = new ParkingSlot(car,"TW1",false, null);
		ParkingService parkservice = new ParkingService();


		assertEquals(true, parkservice.parkCar(car,psrkingslot) );


	}

}
