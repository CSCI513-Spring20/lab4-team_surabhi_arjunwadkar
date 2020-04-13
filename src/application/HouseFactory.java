public abstract class HouseFactory {
	abstract HouseEntity createHouse(String item);
	public HouseEntity buildhouse(String type)
	{
		HouseEntity house = createHouse(type);
		return house;
	}
}
