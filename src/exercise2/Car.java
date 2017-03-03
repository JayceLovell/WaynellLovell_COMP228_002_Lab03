package exercise2;

public class Car extends FootPrint {;
	private int milesDriven;
	private int FuelEfficency;
	private int carbondioxide;
	private int gallons;
	
	public Car()
	{
		
	}
	public int getMilesDriven() {
		return milesDriven;
	}
	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}
	public int getFuelEfficency() {
		return FuelEfficency;
	}
	public void setFuelEfficency(int fuelEfficency) {
		FuelEfficency = fuelEfficency;
	}
	public int getCarbondioxide() {
		return carbondioxide;
	}
	public void setCarbondioxide(int carbondioxide) {
		this.carbondioxide = carbondioxide;
	}
	public int getGallons() {
		return gallons;
	}
	public void setGallons(int gallons) {
		this.gallons = gallons;
	}
	@Override
	public void getFootPrint(){
		carbonFootPrint = ((milesDriven/FuelEfficency)*(19.36/(carbondioxide/gallons)))/2204.6;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nMileage: " + milesDriven + 
				"\nFuelEfficency: " + FuelEfficency;
	}
}