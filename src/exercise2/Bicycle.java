/**
 * 
 */
package exercise2;

/**
 * @author Waynell Lovell
 *
 */
public class Bicycle extends FootPrint {
	private int distanceRode;
	
	public int getDistanceRode() {
		return distanceRode;
	}
	public void setDistanceRode(int distanceRode) {
		this.distanceRode = distanceRode;
	}
	//I don't know these things are correct i searched and searched and end up with this stuff from People.....eh
	@Override
	public void getFootPrint(){
		carbonFootPrint=distanceRode*21;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nDistance Rode on Bicycle: "+distanceRode
				;
	}
}
