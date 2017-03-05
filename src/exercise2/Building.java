package exercise2;

public class Building extends FootPrint {
	private int amountOfElectricity;

	public int getAmountOfElectricity() {
		return amountOfElectricity;
	}

	public void setAmountOfElectricity(int amountOfElectricity) {
		this.amountOfElectricity = amountOfElectricity;
	}
	//I don't know these things are correct i searched and searched and end up with this stuff from People.....eh
	@Override
	public void getFootPrint(){
		carbonFootPrint = amountOfElectricity*0.680389;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nAmount Of Electricity: "+amountOfElectricity;
	}
}
