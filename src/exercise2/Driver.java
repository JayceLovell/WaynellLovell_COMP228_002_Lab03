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
		car.setMilesDriven(Integer.parseInt(JOptionPane.showInputDialog("Miles Driven in car")));
		car.setGallons(Integer.parseInt(JOptionPane.showInputDialog("Gallons Car take.")));
		car.setFuelEfficency(Integer.parseInt(JOptionPane.showInputDialog("Car fuel effiency")));
		car.setCarbondioxide(100);
		car.getFootPrint();
		
		Building building = new Building();
		building.setAmountOfElectricity(Integer.parseInt(JOptionPane.showInputDialog("Amount of Electricity Building uses")));
		building.getFootPrint();
		
		Bicycle bicycle = new Bicycle();
		bicycle.setDistanceRode(Integer.parseInt(JOptionPane.showInputDialog("Distance rode on Bicycle.")));;
		bicycle.getFootPrint();
		
		carbonfootprint.add(car);
		carbonfootprint.add(building);
		carbonfootprint.add(bicycle);
		PrintCarbonFootprint(carbonfootprint);
		
	}
	public static void PrintCarbonFootprint(ArrayList<CarbonFootprint> cfp)
	{
		for(CarbonFootprint carbonfootprint : cfp){
			JOptionPane.showMessageDialog(null,carbonfootprint.toString());
		}
	}

}
