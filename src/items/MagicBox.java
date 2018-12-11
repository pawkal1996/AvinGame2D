package items;

import java.util.ArrayList;
import java.util.Random;

/**
 * MagicBox is a special Item which contains random item
 * @author Pawe³ K
 *
 */
public class MagicBox extends Item {
	private static ArrayList<Item> magicBoxDrop = new ArrayList<Item>();
	/**
	 * This method loads items possible to drop from Magic Box.
	 */
	public static void initDropBox() {
		magicBoxDrop.addAll(Sword.getSwords());
		magicBoxDrop.addAll(Armor.getArmors());
		magicBoxDrop.addAll(Gold.getGold());
	}
	
	public static Item openDropBox() {
		Item drop=null;
		Random random = new Random();
		int n = random.nextInt(magicBoxDrop.size());
		drop = magicBoxDrop.get(n);
		return drop;
	}
	
	
}
