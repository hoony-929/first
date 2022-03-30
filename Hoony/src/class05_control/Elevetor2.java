package class05_control;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Elevetor2 {

	public static void main(String[] args) {
		int elevatorA = 10;
		int elevatorB = 4;

		Scanner sc = new Scanner(System.in);

		// 움직인 엘리베이터가 A면 1, B면 2
		final int ACT_ELE_A = 1; // 찾기 쉽게
		final int ACT_ELE_B = 2;
		int actEle = 0;

		while (true) {
			System.out.println("\n========== 희영빌딩 엘리베이터 ==========\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA + "층");
			System.out.println("승강기 B의 현재 위치: " + elevatorB + "층");

			System.out.println("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");

			String inputText = sc.nextLine();
			// 종료를 입력했는지 확인하고 종료시킴
			if (inputText.toLowerCase().equals("q") || inputText.toLowerCase().equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 숫자만 입력했는지 확인
			// 정규 표현식 regex(Regular Extration?) - 회원가입 할 때 쓴다.
			// 단축키 Ctrl + H '핵 꿀 팁!'
			String regex = "^[0-9]+$"; // 문자의 시작(^)과 문자의 끝($) 사이에 숫자[0-9]가 1개 이상 (+) 존재
										// 하는지 체크하기 위한 정규표현식
			// inputText가 숫자로 이루어진 문자열이면 isNum은 true
			boolean isNum = Pattern.matches(regex, inputText); // inputText가 문자이므로 inNum은 false
			if (!isNum) { // !(false) isNum(false) false끼리 이므로 true
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			// 사용자가 입력한 층수를 int로 변환
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 엘리베이터 호출");

			// 사용자의 위치와 각 엘리베이터 층수의 차이 계산
			int diffFloorA = (custFloor > elevatorA) ? (custFloor - elevatorA) : (elevatorA - custFloor);
			int diffFloorB = Math.abs(custFloor - elevatorB);

			// 위치 차이에 따른 엘리베이터 이동
			if (diffFloorA > diffFloorB) {
				System.out.println("승강기 B가 " + custFloor + "층으로 이동하였습니다.");
				elevatorB = custFloor;
				actEle = ACT_ELE_B;
			} else if (diffFloorB > diffFloorA) {
				System.out.println("승강기 A가 " + custFloor + "층으로 이동하였습니다.");
				elevatorA = custFloor;
				actEle = ACT_ELE_A;
			} else {
				if (elevatorA > elevatorB) {
					System.out.println("승강기 A가 " + custFloor + "층으로 이동하였습니다.");
					elevatorA = custFloor;
					actEle = ACT_ELE_A;
				} else {
					System.out.println("승강기 B가 " + custFloor + "층으로 이동하였습니다.");
					elevatorB = custFloor;
					actEle = ACT_ELE_B;
				}
			}
			while (true) {
				System.out.print("어느 층으로 이동하시겠습니까?: ");
				inputText = sc.nextLine();

				isNum = Pattern.matches(regex, inputText);
				if (!isNum) { // isNum 숫자가 아닌 입력 false , ! = false이므로 true가 되어 if문 실행
					System.out.println("잘못 입력했습니다.");
					continue;
				}

				int goToFloor = Integer.parseInt(inputText);
				if (actEle == ACT_ELE_A) {
					System.out.println("승강기 A가 " + goToFloor + "층으로 이동했습니다.");
					elevatorA = goToFloor;
//					break;
				} else if (actEle == ACT_ELE_B) {
					System.out.println("승강기 B가 " + goToFloor + "층으로 이동했습니다.");
					elevatorB = goToFloor;
//					break;
				}
				break; // 밖에 하나만 해도 종료 됨
			}

		}
	}
}
