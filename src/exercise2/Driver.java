/**
 * 
 */
package exercise2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import exercise1.Drink;

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
		car.setName("test");
		car.setMilesDriven(2400);
		car.setGallons(10);
		car.setFuelEfficency(10);
		car.setCarbondioxide(209);
		car.getFootPrint();
		carbonfootprint.add(car);
		PrintCarbonFootprint(carbonfootprint);
	}
	public static void PrintCarbonFootprint(ArrayList<CarbonFootprint> cfp)
	{
		for(CarbonFootprint carbonfootprint : cfp){
			JOptionPane.showMessageDialog(null,carbonfootprint.toString());
		}
	}

}
