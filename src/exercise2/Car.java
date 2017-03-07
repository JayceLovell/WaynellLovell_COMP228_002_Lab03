package exercise2;

public class Car implements CarbonFootprint {;
	private int milesDriven;
	private int FuelEfficency;
	private int carbondioxide;
	private int gallons;
	private double carbonFootPrint;
	
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
	
	//I don't know these things are correct i searched and searched and end up with this stuff from People.....eh
	public void getFootPrint(){
		carbonFootPrint = ((milesDriven/FuelEfficency)*(19.36/(carbondioxide/gallons)))/2204.6;
	}
	public String toString() {
		return "Carbon Footprint: "+carbonFootPrint+
				"\nMileage: " + milesDriven + 
				"\nFuelEfficency: " + FuelEfficency;
	}
}
