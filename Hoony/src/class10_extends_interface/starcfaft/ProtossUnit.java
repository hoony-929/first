package class10_extends_interface.starcfaft;

public class ProtossUnit extends StarUnit{
	private int sheild;

	public ProtossUnit(String name, int damage, int hp, int attackRange, double attackSpeed, int mineral, int gas,
			int sheild) {
		super(name, damage, hp, attackRange, attackSpeed, mineral, gas);
		this.sheild = sheild;
	}

	public int getSheild() {
		return sheild;
	}

	public void setSheild(int sheild) {
		this.sheild = sheild;
	}

	
	
	
}
