/**
 * 
 */
package exercise1;

/**
 * @author Waynell Lovell
 *
 */
public class Coffee extends Drink{
	private String name;
	private String wipped;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String type) {
		this.name = type;
	}
	/**
	 * @return the wipped
	 */
	public String getWipped() {
		return wipped;
	}
	/**
	 * @param wipped the wipped to set
	 */
	public void setWipped(String wipped) {
		this.wipped = wipped;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+
				"\nName: " + name + 
				"\nWipped: " + wipped;
	}
	
	
}
