package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DriversManagerTest {
	private DriversManager driversManager=new DriversManager();

	@Test
	void  isAddPassenger(){
		Passenger passenger1=new Passenger("Diana", "ABC123");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1,driversManager.getPassenger("ABC123"));
	}

	@Test
	void  isAddDriver(){
		Driver driver1=new Driver("Diana1", "ABC1231",21.02);
		driversManager.addDriver(driver1);
		assertEquals(driver1,driversManager.getDriver("ABC1231"));
	}


		
	}

