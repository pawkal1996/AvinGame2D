package items;

import java.util.ArrayList;

/**
 * Class created for money which need to be treated as item
 * @author Pawe³ K
 *
 */
public class Gold extends Item {
	private static ArrayList<Gold> gold = new ArrayList<>();
	private int value;
	
	public Gold(int value) {
		super();
		this.name = "Gold";
		this.value = value;
	}
	
	public static ArrayList<Gold> getGold() {
		return gold;
	}

	public static void setGold(ArrayList<Gold> gold) {
		Gold.gold = gold;
	}

	public static void createGold() {
		gold.add(new Gold(100));
		gold.add(new Gold(150));
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
