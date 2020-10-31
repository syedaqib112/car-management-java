package customer_service;

import java.util.*;

import car.Car;
import showroom_service.Showroom;

public class Customer {
	public static void main(String[] args) {
		Showroom showObj = new Showroom();
		HashMap<String, ArrayList<String>> carSpec = showObj.getcarType();

		carSpec.forEach((key, value) -> System.out.println(key + " = " + value));
		System.out.println();

		boolean flag = showObj.getorder("XUV", "Blue", "5", 5);
		if (flag == true) {
			ArrayList<Car> carList = showObj.getShipment();
			System.out.println(carList);
		} else {
			System.out.println("Specifications not avaliable");
		}

	}
}
