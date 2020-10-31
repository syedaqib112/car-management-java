package factory_service;

import car.Car;

public class Factory {
	public Car manufacture(String carType, String carColor, String noOfGears) {
		Car carObj = new Car();
		carObj.setCarType(carType);
		carObj.setCarColor(carColor);
		carObj.setNoOfGears(noOfGears);
		return carObj;
	}
}
