package class10_extends_interface.starcfaft;

public class SiegeTank extends StarUnit{

	
	
	

	public SiegeTank() {
		super("시즈탱크", 30, 200, 5, 1.5, 200, 125);
	}
	
	public void sieheMod() {
		System.out.println("시즈모드 변신");
		super.setDamage(70);
		super.setAttackRange(12);
	}


	@Override
	public String toString() {
		return "SiegeTank [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", attackRange=" + getAttackRange()
				+ ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
	}
	
	
	
	
	
}
