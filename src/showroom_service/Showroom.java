package showroom_service;

import java.util.ArrayList;

import car.Car;
import factory_service.Factory;

public class Showroom {
	Car car = new Car();

	public ArrayList<String> getcarType() {
		ArrayList<String> carTypes = new ArrayList<>();
		carTypes.add("SUV");
		carTypes.add("XUV");
		carTypes.add("Sedan");
		carTypes.add("hatchback");
		return carTypes;
	}

	public boolean getorder(String carType) {
		Factory factObj = new Factory();
		car = factObj.manufacture(carType);
		if (car != null) {
			return true;
		}
		return false;
	}

	public Car getShipment() {
		return car;
	}

}