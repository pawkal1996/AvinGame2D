package items;

import java.util.ArrayList;

/**
 * Class for weapons
 * @author Pawe³ K
 *
 */
public class Sword extends Item {
	
	private static ArrayList<Sword> swords = new ArrayList<>();
	private int attack;
	
	public Sword(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public static void createSwords() {
		swords.add(new Sword("¯elazny sztylet", 10));
		swords.add(new Sword("Diabelska brzytwa", 20));
		swords.add(new Sword("Piekielny tasak", 30));
		swords.add(new Sword("Epicka halabarda", 40));
	}

	public static ArrayList<Sword> getSwords() {
		return swords;
	}

	public static void setSwords(ArrayList<Sword> swords) {
		Sword.swords = swords;
	}

	public int getAttack() {
		return attack;
	}
		
	public void setAttac(int attack) {
		this.attack = attack;
	}
}
