package items;

public class Sword extends Item {
	
	public Sword(String name, int attack) {
		super.increaseId();
		this.name = name;
		this.attack = attack;
	}
	
	Sword sword1 = new Sword("¯elazny sztylet", 10);
	Sword sword2 = new Sword("Diabelska brzytwa", 20);
	Sword sword3 = new Sword("Piekielny tasak", 30);
	Sword sword4 = new Sword("Epicka halabarda", 40);

	private String name;
	private int attack;
	
	public int getAttack() {
		return attack;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAttac(int attack) {
		this.attack = attack;
	}
	
	

	
	
}
