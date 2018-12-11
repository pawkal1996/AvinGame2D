package items;

/**
 * Abstract class having subclasses: Sword, Armor, Gold, MagicBox, Gold
 * @author Pawe³ K
 *
 */
public abstract class Item {
	private static int id=0;
	protected String name;
	
	/**
	 * This method loads items from lists
	 */
	public static void createItems() {
		Sword.createSwords();
		Armor.createArmors();
		Gold.createGold();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void increaseId() {
		Item.id =+ 1;
	}
	
}
