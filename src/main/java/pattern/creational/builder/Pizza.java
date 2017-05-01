/**
 * 
 */
package pattern.creational.builder;

/**
 * Example of Builder Pattern.
 * @author Monic.Bhanushali
 *
 */
public class Pizza {

	private String bread;
	private String sauce;
	private String cheese;
	private String topping;
	private String crust;
	
	private Pizza(PizzaBuilder builder){
		this.bread = builder.bread;
		this.sauce = builder.sauce;
		this.cheese = builder.cheese;
		this.topping = builder.topping;
		this.crust = builder.crust;
	}
	
	public static class PizzaBuilder{
		private String bread;
		private String sauce;
		private String cheese;
		private String topping;
		private String crust;
		
		public PizzaBuilder(){}
		
		public Pizza build(){
			return new Pizza(this);
		}
		
		public PizzaBuilder withBread(String bread){
			this.bread = bread;
			return this;
		}
		
		public PizzaBuilder withSauce(String sauce){
			this.sauce = sauce;
			return this;
		}
		
		public PizzaBuilder withCheese(String cheese){
			this.cheese = cheese;
			return this;
		}
		
		public PizzaBuilder withTopping(String topping){
			this.topping = topping;
			return this;
		}
		
		public PizzaBuilder withCrust(String crust){
			this.crust = crust;
			return this;
		}
	}

	public String getBread() {
		return bread;
	}

	public String getSauce() {
		return sauce;
	}

	public String getCheese() {
		return cheese;
	}

	public String getTopping() {
		return topping;
	}

	public String getCrust() {
		return crust;
	}
	
	public String toString(){
		return "[ Bread : "+this.bread+ ", Sauce : " + this.sauce + ", Cheese : " + this.cheese
				+ ", Topping : " + this.topping + ", Crust : " + this.crust + " ]";
	}
	
}
