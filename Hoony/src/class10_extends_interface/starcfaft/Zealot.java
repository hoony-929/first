package class10_extends_interface.starcfaft;

public class Zealot extends ProtossUnit{

	
	
	public Zealot() {
		super("질럿", 16, 100, 1, 1.5, 100, 0, 60);
	}


	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", damage=" + super.getDamage() + ", hp=" + getHp() + ", sheild=" + getSheild() + ", attackRange="
				+ getAttackRange() + ", attackSpeed=" + super.getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
	}

}
