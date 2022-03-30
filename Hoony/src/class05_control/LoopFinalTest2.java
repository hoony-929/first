package class05_control;

import java.util.Scanner;

public class LoopFinalTest2 {

	public static void main(String[] args) {

		int rullDeg = 5834;
		int giftDeg = rullDeg % 360; // 남은 각도

		System.out.println(rullDeg / 360 + "바퀴");
		if (giftDeg > 0 && giftDeg <= 60) {
			System.out.println("경품: 사탕");
		} else if (giftDeg > 60 && giftDeg <= 120) {
			System.out.println("경품: 초콜릿");
		} else if (giftDeg > 120 && giftDeg <= 180) {
			System.out.println("경품: 쿠키");
		} else if (giftDeg > 180 && giftDeg <= 240) {
			System.out.println("경품: 콜라");
		} else if (giftDeg > 240 && giftDeg <= 300) {
			System.out.println("경품: 아이스크림");
		} else if (giftDeg > 300 && giftDeg <= 360 && giftDeg == 0) {
			System.out.println("경품: 커피머신");
		}

		System.out.println("\n========================= 로꾸꺼 ==========================\n");

		// 사용자가 입력한 문자열의 순서를 뒤집어서 출력해보세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("거꾸로 뒤집을 문자열을 입력하세요: ");
//		String inputText = sc.nextLine();

		// charAt을 이용한 방법
//		for(int i = inputText.length()-1; i >= 0; i--) { // 문자열은 0부터 세므로 -1
//			System.out.print(inputText.charAt(i)); 
//		}

		// substgring을 이용한 방법
//		String reverse = "";
//		for (int i = inputText.length(); i > 0; i--) {
//			reverse += inputText.substring(i - 1, i);
//		}
//		System.out.println("로꾸꺼: " + reverse);

		// 숫자 문자열의 각 자리수를 더해서 출력
//		String example = "54971285213";
//		int result = 0;
//		for(int i = 0; i < example.length(); i++) {
//			String strNum = example.substring(i,i+1);
//			int intNum = Integer.parseInt(strNum);
//			result += intNum;
//			
//			int intNum2 = Integer.parseInt(example.substring(i,i+1));
//			result += intNum2;
//			
//			result += Integer.parseInt(example.substring(i,i+1));
//		} System.out.println("각 자리수를 더한 결과는 " +result);

		System.out.println("\n================== 2월 달력 ====================\n");

		// 2월 달력을 출력해봅시다.
		// 화요일에 1일 스타트
		// startDay는 요일을 기준으로 일요일은 0, 월요일은 1...... 토요일은 6

		int startDay = 2; // 2-> 화요
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < 42; i++) {
			if (i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;

				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			// i 가 6, 13, 20, 27인 경우 줄바꿈
			if (i % 7 == 6) {
				System.out.println();
			}
		}
		System.out.println("\n======================== 6월 달력 ==============================\n");

		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < 42; i++) {
			if (i >= startDay) {
				if (currentDay < 10) {
					System.out.print(" ");
				} 
					System.out.print(currentDay + "\t");
					currentDay++;
				
				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			if (i % 7 == 6) {
				System.out.println();
			}
		}

	}

}
