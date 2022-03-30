package class10_extends_interface.ramen;

public class BulDakRamen extends Ramen{

	public BulDakRamen(String name, int price) {
		super(name, price);
		
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 넣어 3분간 익힌 후 물을 버리고 액상스프를 섞어주세요");
		
	}

}
