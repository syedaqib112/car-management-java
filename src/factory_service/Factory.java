package factory_service;

import car.Car;

public class Factory {
	public Car manufacture(String carType) {
		Car carObj = new Car();
		carObj.setCarType(carType);
		carObj.setCarColor("RED");
		carObj.setNoOfGears(5);
		return carObj;
	}
}
