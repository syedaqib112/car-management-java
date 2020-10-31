package car;

public class Car {
	private String carType;
	private String carColor;
	private String noOfGears;

	public Car() {

	}

	public Car(String carType, String carColor, String noOfGears) {
		this.carType = carType;
		this.carColor = carColor;
		this.noOfGears = noOfGears;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(String noOfGears) {
		this.noOfGears = noOfGears;
	}

	@Override
	public String toString() {
		return "Car [carType=" + carType + ", carColor=" + carColor + ", noOfGears=" + noOfGears + "]";
	}
}
