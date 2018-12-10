package items;

import java.util.ArrayList;
import java.util.Random;

public class MagicBox extends Item {
	private static ArrayList<Item> magicBoxDrop = new ArrayList<Item>();
	public static void initDropBox() {
		magicBoxDrop.add(Sword.sword1);
		magicBoxDrop.add(Sword.sword2);
		magicBoxDrop.add(Sword.sword3);
		magicBoxDrop.add(Sword.sword4);
	}
	
	public static Item openDropBox() {
		Item drop=null;
		Random random = new Random();
		int n = random.nextInt(magicBoxDrop.size());
		drop = magicBoxDrop.get(n);
		return drop;
	}
	
	
}
