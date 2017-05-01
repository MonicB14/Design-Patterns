/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Monic.Bhanushali
 *
 */
public class Demo {

	public static void main(String[] args) {

		System.out.println("\n\nPrototype pattern demo..\n");
		
		Inventory inventory = new Inventory();
		Item item = inventory.getItemFromInventory(1);
		System.out.println("\n---- Shallow Copy Works----");
		
		//As Song object has only primitive and String member fields shallow copy works fine here.
		//Hashcode of original and cloned song would be different.
		System.out.println("Cloned Song : "+ item);
		System.out.println("Original Song: " + inventory.getInventory().get(1));
		
		//Shallow copy fails in case of Movie object as Movie has an attribute of type ProductionHouse.
		//Hashcode of original and cloned movie will be obviously different as they will be two separate objects 
		//but they will be pointing to same ProductionHouse object.
		System.out.println("\n\n---- Shallow Copy Fails----");
		Movie movie = (Movie) inventory.getItemFromInventory(3);
		System.out.println("Cloned Movie:"+movie);
		System.out.println("Cloned ProductionHouse:" + movie.getProductionHouse());
		System.out.println("Original Movie: " + inventory.getInventory().get(3));
		System.out.println("Original ProductionHouse"+ ((Movie)inventory.getInventory().get(3)).getProductionHouse());
	}

}
