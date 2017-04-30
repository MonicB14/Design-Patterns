/**
 * 
 */
package pattern.creational.factory;

/**
 * @author Monic.Bhanushali
 *
 */
public class FactoryDemo {

	public static void main(String[] args) {
		
		Car sportsCar = CarFactory.getCar(CarType.SPORTS);
		sportsCar.setBrand("Lamborghini");
		sportsCar.setColor("Black");
		System.out.println(sportsCar);
		
		Car publicCar = CarFactory.getCar(CarType.PUBLIC);
		publicCar.setBrand("Honda");
		publicCar.setColor("White");
		System.out.println(publicCar);
	}

}
