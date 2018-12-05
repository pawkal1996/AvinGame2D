package items;

public class Gold extends Item {
	private int value;

	public Gold(int value) {
		super();
		this.name = "Gold";
		this.value = value;
	}
	
	public static void createGold() {
		Gold gold100 = new Gold(100);
		Gold gold200 = new Gold(150);
	}
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
}
