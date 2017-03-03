/**
 * 
 */
package exercise2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author Waynell Lovell
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CarbonFootprint> carbonfootprint=new ArrayList<CarbonFootprint>();
		Car car = new Car();
		car.setName("Car");
		car.setMilesDriven(2000);
		car.setGallons(100);
		car.setFuelEfficency(100);
		car.setCarbondioxide(100);
		car.getFootPrint();
		
		Plane plane = new Plane();
		plane.setName("Plane");
		plane.setMilestraveled(2500);
		plane.setGallons(100);
		plane.setCarbondioxide(100);
		plane.setAmountOfPassengers(100);
		plane.getFootPrint();
		
		House house = new House();
		house.setName("House");
		house.setNumberOfPeople(4);
		house.setAmountOfElectricity(1400);
		house.getFootPrint();
		
		carbonfootprint.add(car);
		carbonfootprint.add(plane);
		carbonfootprint.add(house);
		PrintCarbonFootprint(carbonfootprint);
		
	}
	public static void PrintCarbonFootprint(ArrayList<CarbonFootprint> cfp)
	{
		for(CarbonFootprint carbonfootprint : cfp){
			JOptionPane.showMessageDialog(null,carbonfootprint.toString());
		}
	}

}
