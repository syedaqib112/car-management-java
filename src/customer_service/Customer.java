package customer_service;

import java.util.*;

import car.Car;
import showroom_service.Showroom;

public class Customer {
	public static void main(String[] args) {
		Car car = new Car();
		Showroom showObj = new Showroom();
		HashMap<String, ArrayList<String>> carSpec = showObj.getcarType();

		carSpec.forEach((key, value) -> System.out.println(key + " = " + value));
		System.out.println();

		boolean flag = showObj.getorder("XUV", "Blue", 4);
		if (flag == true) {
			car = showObj.getShipment();
		}
		System.out.println(car);
	}
}
