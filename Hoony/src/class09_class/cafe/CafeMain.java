package class09_class.cafe;

import java.util.Scanner;

import class09_class.Constants;

public class CafeMain {
	public static void main(String[] args) {
		Cafe starBucks = new Cafe("스타벅스");
		starBucks.addCoffee(new Coffee("아메리카노", 4300));
		starBucks.addCoffee(new Coffee("돌체라떼", 5400));
		starBucks.addCoffee(new Coffee("고구마라떼", 5200));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCoffee(new Coffee("아메리카노", 2500));
		conte.addCoffee(new Coffee("카페라떼", 3200));
		conte.addCoffee(new Coffee("카라멜마끼야또", 3500));	
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("방문할 카페를 선택해 주세요");
			System.out.println(" 1. 스타벅스 | 2. 꽁떼 | 3. 사무실로 복귀...");
			System.out.println(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			
			if(select == 1) {
				// 스타벅스 입장
				System.out.printf(Constants.welcome_cafe, starBucks.getName());
				System.out.println("메뉴판");
				starBucks.showCoffeeList();
				
				System.out.print("메뉴를 선택해 주세요.");
				String inputText = sc.nextLine();
				
				int index = starBucks.indexOfCoffee(inputText);
				if(index != -1) {
					Coffee coffee = starBucks.getCoffee(index);
					System.out.println(coffee.getName() + "는 " + coffee.getPrice() + "원 입니다.");
				}
				
				
			} else if(select == 2) {
				// 꽁떼 입장
				System.out.printf(Constants.welcome_cafe, conte.getName());
				System.out.println("메뉴판");
				conte.showCoffeeList();
				
				System.out.print("메뉴를 선택해 주세요.");
				String inputText = sc.nextLine();
				
				int index = conte.indexOfCoffee(inputText);
				if(index != -1) {
					Coffee coffee = conte.getCoffee(index);
					System.out.println(coffee.getName() + "는 " + coffee.getPrice() + "원 입니다.");
				}
				
				
				
			} else if(select == 3) {
				System.out.println("사무실로 복귀... 아 가기 싫다...");
				break;
			}
			
			
		}
		
		
	}
}
