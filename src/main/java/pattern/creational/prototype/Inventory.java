/**
 * 
 */
package pattern.creational.prototype;

import java.util.HashMap;

/**
 * @author Monic.Bhanushali
 */
public class Inventory {

	private HashMap<Integer, Item> inventory;
	
	public Inventory(){
		inventory = new HashMap<Integer, Item>();
		loadInventory();
	}
	
	/**
	 * Returns shallow copied instance of object associated with specified key.
	 * @param key
	 * @return {@code Item}
	 */
	public Item getItemFromInventory(Integer key){
		try {
			return (Item) inventory.get(key).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public HashMap<Integer, Item> getInventory(){
		return inventory;
	}
	
	/**
	 * Loads few Item into the inventory.
	 */
	private void loadInventory() {
		Book book = new Book();
		book.setType(ItemType.BOOK);
		book.setAuthor("John Doe");
		book.setCost(299);
		book.setName("Learn to Design");
		
		Song song = new Song();
		song.setType(ItemType.SONG);
		song.setSinger("MakMix");
		song.setName("Live it your way");
		song.setCost(59);
		
		Movie movie = new Movie();
		movie.setCost(500);
		movie.setName("SuperPattern");
		movie.setType(ItemType.MOVIE);
		ProductionHouse house = new ProductionHouse("First Movie P.H", "Monic");
		movie.setProductionHouse(house);
		
		inventory.put(1, book);
		inventory.put(2, song);
		inventory.put(3, movie);
	}
	
	public boolean compareWithInventory(Item item){
		return inventory.containsValue(item);
	}
}
