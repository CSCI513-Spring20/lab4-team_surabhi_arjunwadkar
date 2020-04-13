package application;

public class HouseAreaFactory {
	public HouseEntity createHouse(String type) {
		if(type.equals("Kitchen")) {
			return new HouseArea("Kitchen");
		} else if(type.equals("Bedroom")) {
			return new HouseArea("Bedroom");
		} else if(type.equals("Bathroom")) {
			return new HouseArea("Bathroom");
		} else if(type.equals("Downstairs")) {
			return new HouseArea("Downstairs");
		} else if(type.equals("Upstairs")) {
			return new HouseArea("Upstairs");
		} else return null;
	}
}