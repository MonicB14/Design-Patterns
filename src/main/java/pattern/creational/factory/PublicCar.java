/**
 * 
 */
package pattern.creational.factory;

/**
 * @author Monic.Bhanushali
 *
 */
public class PublicCar extends Car{
	
	@Override
	public String toString() {
		return "Public Car{ " + "Brand:"+getBrand()+" Color:"+getColor()+" }";
	}
}
