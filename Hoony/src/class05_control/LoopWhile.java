package class05_control;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// while문
		
		int i = 2;
		while(i <= 9) { // 조건문
			System.out.println("2 x " + i + " = " + (2*i)); // 실행문
			i++; // 증감식
		}

		// for문과 비슷..
		
		System.out.println("\n=========================================================\n");
		
		i = 2;
		for( ; i <= 9; ) {
			System.out.println("2 x " + i + " = " + (2*i));
			i++;
		}
		
		System.out.println("\n=========================================================\n");
		
		// 사용자가 콘솔에 텍스트를 입력할때마다 텍스트를 출력해주는 프로그램
		// level 1
//		boolean isRunning = true;
//		Scanner sc = new Scanner(System.in);
//		
//		while(isRunning) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			
//			String inputText = sc.nextLine();
//			
//			if(inputText.equals("q") || inputText.equals("Q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				isRunning = false;
//			} else {
//				System.out.println(inputText);
//			}
//		}
		
//		// level 2
//		while(true) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			
//			String inputText = sc.nextLine();
//			//.toLowerCase() 해당 알파벳을 소문자로 바꿔준다.
//			if(inputText.toLowerCase().equals("q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			} else {
//				System.out.println(inputText);
//			}
//		}
//		sc.close();
		System.out.println("\n=========================================================\n");
		// ㅁㅁㅂㅈ do-while문
		
//		isRunning = false;
//		do {
//		  System.out.println("프로그램이 시작되었습니다.");
//		} while(isRunning); 
//		  String inputString = "";
//		do {
//		  System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");  
//		  inputString = sc.nextLine();
//		  System.out.println(inputString);
//		} while(!inputString.toUpperCase().equals("Q")); // false = not true , 사용자가 q를 눌렀을때 fasle가 된다.
		
		System.out.println("\n=========================================================\n");
		// 이중(다중) while문
		// 구구단 출력
		
		int intVal = 2;
		while(intVal <= 9) {
			int numVal = 2;
			while(numVal <= 9) {
				System.out.println(intVal + " x " + numVal + " = " + intVal*numVal);
				numVal++;
			}
			System.out.println();
			intVal++;
		}
		
		System.out.println("\n=========================================================\n");
		
		// 포켓몬스터 
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("야생의 펄기아를 만났다. 행동을 선택해주세요.");
			System.out.println("1. 싸우기 | 2. 도망가기");
			System.out.print(">> ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("1")) {
				while(true) {
					System.out.println("공격 방법은?");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">> ");
					
					String attack = scan.nextLine();
					if(attack.equals("1")) {
						System.out.println("피카츄 백만볼트!!!!");
					} else if(attack.equals("2")) {
						System.out.println("피카츄 전광석화!!!!");
					} else if(attack.equals("3")) {
						break; // 내부 while문은 더이상 실행되지 않음 , 외부 while문은 계속 실행
					} else {
						System.out.println("잘못 입력했습니다.");
					}
					}
			} else if(inputText.equals("2")) {
				System.out.println("무사히 도망갔습니다.");
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
//			scan.close(); // 사용자로부터 값을 입력받는 Scanner 객체를 종료한다. 
			
//			String inputText = scan.nextLine();
			// scanner를 닫은 후 입력 받으려면 에러 발생, 더이상 입력받을 일이 없을 때 close()를 한다.
			// 사실 Scanner는 AutoCloseable을 구현하고 있기 때문에 자동으로 close 되고 있지만, 눈에보이게 close를
			// 해주면 좋다.
			// Ctrl + 마우스 클릭 -> 해당 변수가 선언된 위치나, 해당 클래스가 있는 위치 등 찾아간
			
		}
		
		
		
		
	}

}
