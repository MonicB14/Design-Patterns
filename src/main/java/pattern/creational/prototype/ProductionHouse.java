/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Monic.Bhanushali
 *
 */
public class ProductionHouse {

	private String name;

	private String owner;
	
	public ProductionHouse(String houseName, String owner){
		this.name = houseName;
		this.owner = owner;
	}
	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}
	
}
