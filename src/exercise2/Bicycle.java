/**
 * 
 */
package exercise2;

/**
 * @author Waynell Lovell
 *
 */
public class Bicycle implements CarbonFootprint {
	private int distanceRode;
	protected double carbonFootPrint;
	
	public int getDistanceRode() {
		return distanceRode;
	}
	public void setDistanceRode(int distanceRode) {
		this.distanceRode = distanceRode;
	}
	//I don't know these things are correct i searched and searched and end up with this stuff from People.....eh
	public void getFootPrint(){
		carbonFootPrint=distanceRode*21;
	}
	public String toString() {
		return "Carbon Footprint: "+carbonFootPrint+
				"\nDistance Rode on Bicycle: "+distanceRode
				;
	}
}
