package factory_service;

import java.util.ArrayList;

import car.Car;

public class Factory {
	public ArrayList<Car> manufacture(String carType, String carColor, String noOfGears, int quantity) {
		ArrayList<Car> listOfObj = new ArrayList<Car>();
		for (int i = 0; i < quantity; i++) {

			Car carObj = new Car();
			carObj.setCarType(carType);
			carObj.setCarColor(carColor);
			carObj.setNoOfGears(noOfGears);
			
			listOfObj.add(carObj);
		}
		return listOfObj;
	}
}
