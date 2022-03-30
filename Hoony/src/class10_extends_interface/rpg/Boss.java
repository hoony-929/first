package class10_extends_interface.rpg;

public class Boss extends Enemy{

	public Boss(String name, int damage, int hp) {
		super(name, damage, hp);
		talk();
	}

	@Override
	public void talk() {
		System.out.println("건방진 놈들 같으니");
		
	}
	
}
