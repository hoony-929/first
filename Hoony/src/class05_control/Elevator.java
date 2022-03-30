package class05_control;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		// TODO 엘리베이터 움직이기
		// 층 수를 입력 시 더 가까운 엘리베이터가 작동
		// 층 수를 입력 시 차이가 같을 경우 위에 있는 엘리베이터가 작동
		// 엘리베이터가 작동 후 그자리에 머물
		// q,Q,EXIT,Exit 입력시 프로그램 종

		int elevatorA = 10;
		int elevatorB = 4;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n========== 희영빌딩 엘리베이터 ===========\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA + "층");
			System.out.println("승강기 B의 현재 위치: " + elevatorB + "층");

			System.out.println("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");

			String elev = sc.nextLine();
			if (elev.toLowerCase().equals("q") || elev.toLowerCase().equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
				int eleFloor = Integer.parseInt(elev);
				if (eleFloor > 10 || eleFloor < 1) {
					System.out.println("잘못 입력했습니다.");
				} else {
					if ((eleFloor - elevatorA) > (elevatorB - eleFloor)) {
						System.out.println(eleFloor + "층에서 엘리베이터를 호출합니다.");
						System.out.println("승강기 A가 " + eleFloor + "층으로 이동하였습니다.");
						elevatorA = eleFloor;
					} else if ((eleFloor - elevatorA) < (elevatorB - eleFloor)) {
						System.out.println(eleFloor + "층에서 엘리베이터를 호출합니다.");
						System.out.println("승강기 B가 " + eleFloor + "층으로 이동하였습니다.");
						elevatorB = eleFloor;
					} else if ((eleFloor - elevatorA) == (elevatorB - eleFloor)) {
						if (elevatorA > elevatorB) {
							System.out.println(eleFloor + "층에서 엘리베이터를 호출합니다.");
							System.out.println("승강기 A가 " + eleFloor + "층으로 이동하였습니다.");
							elevatorA = eleFloor;
						} else if (elevatorA < elevatorB) {
							System.out.println(eleFloor + "층에서 엘리베이터를 호출합니다.");
							System.out.println("승강기 B가 " + eleFloor + "층으로 이동하였습니다.");
							elevatorB = eleFloor;
						} else {
							System.out.println("잘못 입력했습니다.");
						}
					}

				}
			}

		}
	}
}
