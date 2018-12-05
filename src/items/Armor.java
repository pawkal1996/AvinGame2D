package items;

public class Armor extends Item {
	public Armor(String name, int defense) {
		super();
		this.name = name;
		this.defense = defense;
	}
	
	public static void createArmors() {
		Armor armor1 = new Armor("¯elazna zbroja", 10);
		Armor armor2 = new Armor("Kolczaty ¿upan", 20);
		Armor armor3 = new Armor("Szata niewiernego Osazego", 30);
		Armor armor4 = new Armor("Husarska toga Bernuli", 40);
	}

	private int defense;

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
