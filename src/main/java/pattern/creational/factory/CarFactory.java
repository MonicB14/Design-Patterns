/**
 * 
 */
package pattern.creational.factory;

/**
 * @author Monic.Bhanushali
 *
 */
public class CarFactory{

	public static Car getCar(CarType type) {
		switch (type) {
		case SPORTS:
			return new SportsCar();
		case PUBLIC:
			return new PublicCar();
		default:
			return null;
		}
	}
	
}
