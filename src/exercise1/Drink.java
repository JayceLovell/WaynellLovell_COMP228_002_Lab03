/**
 * 
 */
package exercise1;

/**
 * @author 300833478
 *
 */
public abstract class Drink {
	
	private String typeofdrink;
	private String size;
	protected String togo;
	private String iced;
	
	public String getTypeofdrink() {
		return typeofdrink;
	}
	public void setTypeofdrink(String type) {
		this.typeofdrink = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the iced
	 */
	public String getIced() {
		return iced;
	}
	/**
	 * @param iced the iced to set
	 */
	public void setIced(String iced) {
		this.iced = iced;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TypeOfDrink: " + typeofdrink + 
				"\nSize: " + size + 
				"\nTogo: " + togo +
				"\nIced: " + iced+" ";
	}
}
