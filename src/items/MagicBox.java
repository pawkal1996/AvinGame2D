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
	public static void initDropBox() {
		magicBoxDrop.add(Sword.sword1);
		magicBoxDrop.add(Sword.sword2);
		magicBoxDrop.add(Sword.sword3);
		magicBoxDrop.add(Sword.sword4);
		magicBoxDrop.add(Armor.armor1);
		magicBoxDrop.add(Armor.armor2);
		magicBoxDrop.add(Armor.armor3);
		magicBoxDrop.add(Armor.armor4);
		magicBoxDrop.add(Gold.getGold100());
		magicBoxDrop.add(Gold.getGold150());
	}
	
	public static Item openDropBox() {
		Item drop=null;
		Random random = new Random();
		int n = random.nextInt(magicBoxDrop.size());
		drop = magicBoxDrop.get(n);
		return drop;
	}
	
	
}
