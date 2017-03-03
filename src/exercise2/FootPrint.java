package exercise2;

public abstract class FootPrint implements CarbonFootprint{
	private String name;
	protected double carbonFootPrint;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCarbonFootPrint(){
		return carbonFootPrint;
	}
	@Override
	public String toString() {
		return "Name: " + name + 
				"\nCarbonFootPrint: " + carbonFootPrint;
	}
	public abstract void getFootPrint();
}
