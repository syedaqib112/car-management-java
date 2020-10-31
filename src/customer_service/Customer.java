package customer_service;
import car.Car;
import showroom_service.Showroom;

public class Customer {
	public static void main(String[] args) {
		Car car = new Car();
		Showroom showObj = new Showroom();
		System.out.println(showObj.getcarType());

		boolean flag = showObj.getorder("SUV");
		if (flag == true) {
			car = showObj.getShipment();
		}
		System.out.println(car);
	}
}
