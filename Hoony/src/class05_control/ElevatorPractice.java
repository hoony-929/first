package class05_control;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ElevatorPractice {

	public static void main(String[] args) {
		int elevatorA = 10;
		int elevatorB = 4;

		Scanner sc = new Scanner(System.in);

		int actEle = 0; // 도착한 엘리베이터 이동 변

		while (true) {
			System.out.println("\n=========== 희영빌딩 엘리베이터 ==========\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA + "층");
			System.out.println("승강기 B의 현재 위치: " + elevatorB + "층");
			System.out.println("몇층에 계시나요?[종료하려면 q 또는 exit 입력]: ");

			String inputText = sc.nextLine();
			if (inputText.toLowerCase().equals("q") || inputText.toLowerCase().equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// 정규표현식, 문자의 시작과 끝 사이에 숫자가 한개 이상 존재하는지 체크
			String regex = "^[0-9]+$";

			boolean isNum = Pattern.matches(regex, inputText);
			if (!isNum) {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			// visFloor 고객이 누르는 층
			int visFloor = Integer.parseInt(inputText);
			System.out.println(visFloor + "층에서 엘리베이터 호출");

			int diffFloorA = (visFloor > elevatorA) ? (visFloor - elevatorA) : (elevatorA - visFloor);
			int diffFloorB = Math.abs(visFloor - elevatorB);

			if (diffFloorA > diffFloorB) {
				System.out.println("승강기 B가" + visFloor + "층으로 이동했습니다.");
				elevatorB = visFloor;
				actEle = 2;
			} else if (diffFloorB > diffFloorA) {
				System.out.println("승강기 A가" + visFloor + "층으로 이동했습니다.");
				elevatorA = visFloor;
				actEle = 1;
			} else {
				if (elevatorA > elevatorB) {
					System.out.println("승강기 A가" + visFloor + "층으로 이동했습니다.");
					elevatorA = visFloor;
					actEle = 1;
				} else {
					System.out.println("승강기 B가" + visFloor + "층으로 이동했습니다.");
					elevatorB = visFloor;
					actEle = 2;
				}
			}

			while (true) {
				System.out.println("어느 층으로 이동하겠습니까?");
				inputText = sc.nextLine();

				isNum = Pattern.matches(regex, inputText);
				if (!isNum) {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				int goToFloor = Integer.parseInt(inputText);
				if (actEle == 1) {
					System.out.println("승강기 A가 " + goToFloor + "층으로 이동했습니다.");
					elevatorA = goToFloor;
				} else {
					System.out.println("승강기 B가 " + goToFloor + "층으로 이동했습니다.");
					elevatorB = goToFloor;
				}
				break;
			}

		}

	}

}
