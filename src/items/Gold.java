package items;

public class Gold extends Item {
	private int value;

	static Gold gold100;
	static Gold gold150;
	
	public Gold(int value) {
		super();
		this.name = "Gold";
		this.value = value;
	}
	
	public static void createGold() {
		gold100 = new Gold(100);
		gold150 = new Gold(150);
	}
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
}
