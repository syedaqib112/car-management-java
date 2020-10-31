package factory_service;

import java.util.*;

public class Specifications {
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

}
