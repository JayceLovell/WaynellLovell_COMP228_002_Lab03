package exercise2;

public class Plane extends FootPrint {
	private int amountOfPassengers;
	private int milestraveled;
	private int gallons;
	private int carbondioxide;
	
	public int getAmountOfPassengers() {
		return amountOfPassengers;
	}
	public void setAmountOfPassengers(int amountOfPassengers) {
		this.amountOfPassengers = amountOfPassengers;
	}
	public int getMilestraveled() {
		return milestraveled;
	}
	public void setMilestraveled(int milestraveled) {
		this.milestraveled = milestraveled;
	}
	public int getGallons() {
		return gallons;
	}
	public void setGallons(int gallons) {
		this.gallons = gallons;
	}
	public int getCarbondioxide() {
		return carbondioxide;
	}
	public void setCarbondioxide(int carbondioxide) {
		this.carbondioxide = carbondioxide;
	}
	@Override
	public void getFootPrint(){
		carbonFootPrint=((milestraveled/41.986*(amountOfPassengers/gallons))*(20.88*(carbondioxide/gallons)*2.7))/2204.6;
	}
	@Override
	public String toString() {
		return super.toString()+
				"/nAmount of Passengers: "+amountOfPassengers+
				"/nMiles Traveled: "+ milestraveled;
	}
}
