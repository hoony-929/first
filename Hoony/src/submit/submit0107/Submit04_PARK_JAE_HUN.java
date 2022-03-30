package submit.submit0107;

import java.util.Scanner;

public class Submit04_PARK_JAE_HUN {

	public static void main(String[] args) {
		// 사용자로부터 현재신장(cm)과 현재체중(kg)을 입력받아 비만도를 표기해주는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 신장(cm)을 입력해주세요 : ");
		int nowTall = sc.nextInt();
		System.out.println("현재 체중(kg)을 입력해주세요 : ");
		int nowWeight = sc.nextInt();
		
		double avgWeight = (double) (nowTall - 100) * 0.9;
		double heavyWeight = (double) (nowWeight / avgWeight) * 100;

		
		if(heavyWeight > 130) {
			System.out.println("비만입니다.");
		} else if(heavyWeight >= 110 && heavyWeight < 130 ) {
			System.out.println("과체중입니다.");
		} else if(heavyWeight >= 80 && heavyWeight < 110 ) {
			System.out.println("정상체중입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
	}

}
