package items;

public abstract class Item {
	private static int id=0;
	
	public int getId() {
		return id;
	}

	public void increaseId() {
		Item.id =+ 1;
	}
	
}
