/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Monic.Bhanushali
 *
 */
public class Movie extends Item{

	private ProductionHouse house;

	public ProductionHouse getProductionHouse() {
		return house;
	}

	public void setProductionHouse(ProductionHouse house) {
		this.house = house;
	}
}
