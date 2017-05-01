/**
 * 
 */
package pattern.creational.builder;

/**
 * @author Monic.Bhanushali
 *
 */
public class PizzaOrder {

	public static void main(String[] args) {
		
		System.out.println("Ordering custom pizzzzaa....");
		
		Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder();
		builder.withBread("multigrain").withCheese("No").withCrust("Thin").withSauce("Mayo").withTopping("Veggies");
		
		Pizza myPizza = builder.build();
		
		System.out.println(myPizza.toString());
		
	}

}
