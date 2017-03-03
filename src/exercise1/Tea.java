/**
 * 
 */
package exercise1;

/**
 * @author Waynell Lovell
 *
 */
public class Tea extends Drink {
	private String name;
	
	/**
	 * @return the type
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param type the type to set
	 */
	public void setName(String type) {
		this.name = type;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\nName: "+name;
	}
}
