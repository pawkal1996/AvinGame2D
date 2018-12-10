package items;

/**
 * Class created for money which need to be treated as item
 * @author Pawe³ K
 *
 */
public class Gold extends Item {
	private int value;

	private static Gold gold100;
	private static Gold gold150;
	
	public Gold(int value) {
		super();
		this.name = "Gold";
		this.value = value;
	}
	
	public static void createGold() {
		setGold100(new Gold(100));
		setGold150(new Gold(150));
	}
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

	public static Gold getGold150() {
		return gold150;
	}

	public static void setGold150(Gold gold150) {
		Gold.gold150 = gold150;
	}

	public static Gold getGold100() {
		return gold100;
	}

	public static void setGold100(Gold gold100) {
		Gold.gold100 = gold100;
	}


}
