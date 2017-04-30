/**
 * 
 */
package pattern.creational.factory;

/**
 * @author Monic.Bhanushali
 *
 */
public class SportsCar extends Car{

	@Override
	public String toString() {
		return "Sports Car{ " + "Brand:"+getBrand()
		+" Color:"+getColor()+" }";

	}

}
