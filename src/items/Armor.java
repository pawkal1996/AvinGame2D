package items;

import java.util.ArrayList;

/**
 * Class for armors
 * @author Pawe³ K
 *
 */
public class Armor extends Item {
	private static ArrayList<Armor> armors = new ArrayList<>();
	private int defense;
	
	public Armor(String name, int defense) {
		super();
		this.name = name;
		this.defense = defense;
	}
	
	public static void createArmors() {
		armors.add(new Armor("Zelazna zbroja", 10));
		armors.add(new Armor("Kolczaty ¿upan", 20));
		armors.add(new Armor("Szata niewiernego Osazego", 30));
		armors.add(new Armor("Husarska toga Bernuli", 40));
	}	

	public static ArrayList<Armor> getArmors() {
		return armors;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
