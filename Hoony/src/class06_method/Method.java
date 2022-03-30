package class06_method;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// 함수
		// 함수 = 메소드 = method = function
		// method는 클래스에 종속된 함수를 말하며, function은 클래스에 독립적인 함수를 말한다.

		// n부터 m까지 다 더하면 결과는 = ?
		int fromNum = 1;
		int toNum = 100;
		int sumNum = 0;

		System.out.println(fromNum + "부터 " + toNum + "까지 다 더하면 결과는 = ?");
		for (int i = fromNum; i <= toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터 " + toNum + "까지 다 더하면 " + sumNum + "입니다.");

		System.out.println("\n=================================================================\n");
		// 30부터 60가지 다 더하면 결과는 = ?
		fromNum = 30;
		toNum = 60;
		sumNum = 0;
		System.out.println(fromNum + "부터 " + toNum + "까지 다 더하면 결과는 = ?");
		for (int i = fromNum; i < toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터 " + toNum + "까지 다 더하면 " + sumNum + "입니다.");

		System.out.println("\n=================================================================\n");

		// 25부터 50까지 다 더한 값은 = ?
		printSum(25, 50);

		// 함수를 쓰면 좋은점
		// 코드가 간결해진다
		// 중복된 코드를 한 속에서 관리할 수 있으므로, 수정할 때 용이하다.

		System.out.println("\n================================================\n");

		returnSum(40, 50);
		// 리턴 값이 존재하는 함수는 실행 결과를 변수에 담을 수 있다.
		// 이때, 변수 타입은 해당 함수의 리터 타입과 일치해야한다.
		int sum = returnSum(40, 50);
		System.out.println("40부터 50까지 다 더하면 " + sum);
		System.out.println("40부터 50까지 다 더하면 " + returnSum(40, 50));

		System.out.println("\n=============================================================\n");

		// System.out.println()을 print()로 만들어 쓰기
		print("Hello World!");

		int intVal = 100;
		System.out.println(intVal);
		print(intVal);

		System.out.println("\n==================================================\n");

		// void (리턴이 없는) 함수의 return;
		playPokemon();

	} // main 메소드 종료 괄호

	public static void playPokemon() {
		int enemyHp = 100;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("야생의 펄기아를 만났다. 행동을 선택해주세요.");
			System.out.println("1. 싸우기 | 2. 도망가기");
			System.out.print(">> ");

			String inputText = scan.nextLine();

			if (inputText.equals("1")) {
				while (true) {
					System.out.println("공격 방법은?");
					System.out.println("1. 백만볼트 | 2. 도망 | 3. 취소");
					System.out.print(">> ");

					String attack = scan.nextLine();
					if (attack.equals("1")) {
						System.out.println("피카츄 백만볼트!!!!");
						enemyHp -= 50;

						System.out.println("단데기의 체력: " + enemyHp);
						if (enemyHp <= 0) {
							System.out.println("이겼닭!! 치킨이닭!!");
							return; // 메소드를 즉시 종료한다.
						}
					} else if (attack.equals("2")) {
						System.out.println("무사히 도망쳤습니다.");
						return;
					} else if (attack.equals("3")) {
						break; // 내부 while문은 더이상 실행되지 않음 , 외부 while문은 계속 실행
					} else {
						System.out.println("잘못 입력했습니다.");
					}
				}
			} else if (inputText.equals("2")) {
				System.out.println("무사히 도망갔습니다.");
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}

		}
		scan.close();
	}

	// 메소드 오버로딩(Overloading)
	public static void print(String anything) {
		System.out.println(anything);
	}

	public static void print(int anything) {
		System.out.println(anything);
	}

	public static void printSum(int fromNum, int toNum) {
		// void는 리턴값이 없는 함수일 경우 '꼭' 써준다.

		int sumNum = 0;
		sumNum = 0;
		System.out.println(fromNum + "부터 " + toNum + "까지 다 더하면 결과는 = ?");
		for (int i = fromNum; i < toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터 " + toNum + "까지 다 더하면 " + sumNum + "입니다.");

	}

	// 리턴 값이 존재하는 함수로 만들
	public static int returnSum(int a, int b) {
		int sumNum = 0;
		for (int i = a; i < b; i++) {
			sumNum += i;
		}
		return sumNum;

	}
}