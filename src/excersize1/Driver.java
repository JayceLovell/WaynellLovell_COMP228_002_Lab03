/**
 * 
 */
package excersize1;

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
		ArrayList<Drink> trayWithDrinks = new ArrayList<Drink>();
		
		for(int i=0;i<3;i++)
		{

			if(JOptionPane.showInputDialog(null,"Coffee or Tea").equals("Coffee"))
			{
				Coffee coffee = new Coffee();
				coffee.setName(JOptionPane.showInputDialog(null,"Name of Coffee?"));
				coffee.setIced(JOptionPane.showInputDialog(null,"Want Your Coffee iced?"));
				coffee.setSize(JOptionPane.showInputDialog(null,"Size of Coffee"));
				coffee.setTypeofdrink("Coffee");
				coffee.setWipped(JOptionPane.showInputDialog(null,"Wipped on your Coffee?"));
				coffee.togo=JOptionPane.showInputDialog(null,"Is Coffee togo?");
				trayWithDrinks.add(coffee);
			}
			else
			{
				Tea tea = new Tea();
				tea.setName(JOptionPane.showInputDialog(null,"Name of Tea?"));
				tea.setIced(JOptionPane.showInputDialog(null,"Want Your Tea iced?"));
				tea.setSize(JOptionPane.showInputDialog(null,"Size of Tea"));
				tea.setTypeofdrink("Tea");
				tea.togo=JOptionPane.showInputDialog(null,"Is Tea togo?");;
				trayWithDrinks.add(tea);
			}
		}
		
		Printtray(trayWithDrinks);
	}
	public static void Printtray(ArrayList<Drink> tray)
	{
		for(Drink drink : tray){
			JOptionPane.showMessageDialog(null,drink.toString());
		}
	}

}
