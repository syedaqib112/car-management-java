package showroom_service;

import java.util.*;

import car.Car;
import factory_service.Factory;

public class Showroom {
	Car car = new Car();

	public HashMap<String, ArrayList<String>> getcarType() {
		HashMap<String, ArrayList<String>> Specs = new LinkedHashMap<>();

		ArrayList<String> carType = new ArrayList<String>(Arrays.asList("SUV", "XUV", "Sedan", "hatchback"));
		ArrayList<String> carColor = new ArrayList<String>(Arrays.asList("Red", "Blue", "Green", "Yellow"));
		ArrayList<String> noOfGears = new ArrayList<String>(Arrays.asList("4", "5", "6"));

		Specs.put("carType", carType);
		Specs.put("carColor", carColor);
		Specs.put("noOfGears", noOfGears);

		return Specs;

	}

	public boolean getorder(String carType, String carColor, int noOfGears) {
		Factory factObj = new Factory();
		car = factObj.manufacture(carType, carColor, noOfGears);
		if (car != null) {
			return true;
		}
		return false;
	}

	public Car getShipment() {
		return car;
	}

}