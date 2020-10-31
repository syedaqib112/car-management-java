package showroom_service;
import java.util.*;
import car.Car;
import factory_service.*;

public class Showroom {
	Car car = new Car();
	Specifications specCheck = new Specifications();
	HashMap<String, ArrayList<String>> carSpec = new HashMap<>();
	ArrayList<Car> carList = new ArrayList<>();

	public HashMap<String, ArrayList<String>> getcarType() {
		carSpec = specCheck.getcarType();
		return carSpec;
	}

	public boolean getorder(String carType, String carColor, String noOfGears, int quantity) {
		int flag = 0;
		for (ArrayList<String> i : carSpec.values()) {
			if ((i.contains(carType)) || (i.contains(carColor)) || (i.contains(noOfGears))) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {

			Factory factObj = new Factory();
			carList = factObj.manufacture(carType, carColor, noOfGears, quantity);
			if (car != null) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}

	public ArrayList<Car> getShipment() {
		return carList;
	}

}