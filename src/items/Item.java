package items;

public abstract class Item {
	private static int id=0;
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void increaseId() {
		Item.id =+ 1;
	}
	
}
