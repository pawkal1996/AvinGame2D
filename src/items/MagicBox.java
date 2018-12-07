package items;

import java.util.ArrayList;

public class MagicBox extends Item {
	private static ArrayList<Item> magicBoxDrop = new ArrayList<Item>();
	public static void initDropBox() {
		magicBoxDrop.add(Sword.sword1);
		magicBoxDrop.add(Sword.sword2);
		magicBoxDrop.add(Sword.sword3);
		magicBoxDrop.add(Sword.sword4);
		
	}

	
	
}
