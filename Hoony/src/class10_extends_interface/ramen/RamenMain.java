package class10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
		
			JinRamen jinRamen = new JinRamen("진라면", 800);
			
			System.out.println(jinRamen.toString());
			jinRamen.printRecipe();
			
			BulDakRamen buldak = new BulDakRamen("불닭볶음면", 1200);
			
			System.out.println(buldak.toString());
			buldak.printRecipe();
			
			

	}

}
