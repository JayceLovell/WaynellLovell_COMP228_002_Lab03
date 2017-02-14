/**
 * 
 */
package excersize1;

/**
 * @author 300833478
 *
 */
public abstract class Drink {
	
	protected String type;
	protected String size;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	/* 
	 * 
	 */
	@Override
	public String toString() {
		return "type=" + type + ", size=" + size;
	}

}
