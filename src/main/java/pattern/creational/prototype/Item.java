/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Monic.Bhanushali
 */
public abstract class Item implements Cloneable{

	private ItemType type;
	private int cost;
	private String name;
	
	public String getType() {
		return type.toString();
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
