package items;

public class Sword extends Item {
	
	
	static Sword sword1;
	static Sword sword2;
	static Sword sword3;
	static Sword sword4;
	
	public Sword(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public static void createSwords() {
		sword1 = new Sword("¯elazny sztylet", 10);
		sword2 = new Sword("Diabelska brzytwa", 20);
		sword3 = new Sword("Piekielny tasak", 30);
		sword4 = new Sword("Epicka halabarda", 40);
	}
	
	
	private int attack;

	public int getAttack() {
		return attack;
	}
		
	public void setAttac(int attack) {
		this.attack = attack;
	}
	
	

	
	
}
