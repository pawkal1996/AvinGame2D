package items;

public class Armor extends Item {
	
	static Armor armor1;
	static Armor armor2;
	static Armor armor3;
	static Armor armor4;
	
	public Armor(String name, int defense) {
		super();
		this.name = name;
		this.defense = defense;
	}
	
	public static void createArmors() {
		armor1 = new Armor("¯elazna zbroja", 10);
		armor2 = new Armor("Kolczaty ¿upan", 20);
		armor3 = new Armor("Szata niewiernego Osazego", 30);
		armor4 = new Armor("Husarska toga Bernuli", 40);
	}

	private int defense;

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
