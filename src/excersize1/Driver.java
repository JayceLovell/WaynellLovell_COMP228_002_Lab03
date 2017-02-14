/**
 * 
 */
package excersize1;

import java.util.ArrayList;


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
		ArrayList<Drink> trayWithDrinks = new ArrayList<Drink>();
		Coffee coffee = new Coffee();
		coffee.size="Medium";
		coffee.type="Coffee";
		trayWithDrinks.add(coffee);
		Printtray(trayWithDrinks);
	}
	public static void Printtray(ArrayList<Drink> tray)
	{
		for(Drink drink : tray){
			System.out.println(drink.toString());
		}
	}

}
