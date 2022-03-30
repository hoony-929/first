package submit.submit0107;

import java.util.Scanner;

public class Submit05_PARK_JAE_HUN {

	public static void main(String[] args) {
		// 1 ~ 50 사이의 랜덤한 수를 5번 안에 맞춰야 하는 업다운 게임을 만들어보세요.
		// Run 실행 시 1 ~ 50 사이의 랜덤한 수가 생성되며, 사용자가 입력한 숫자에 대해 업, 다운을 알려준다.
		// 5번의 기회 동안 사용자가 정답을 맞추지 못한다면 "실패하였습니다." 문구 출력 후 프로그램이 종료, 사용자가 정답을 맞춘다면 "정답입니다."
		// 문구 출력 후 프로그램이 종료된다.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		
			
		
		int ranNum = (int) ((Math.random()*50)+1);
//		int ranNum = 31;
//		System.out.println(randNum);
		
		
		for(int i = 4; i > 0; i--) {
			int inputNum = sc.nextInt();
			if(inputNum < ranNum) {
				System.out.println("업!! 기회가 " + i + "번 남았습니다.");
				
			} else if(inputNum > ranNum) {
				System.out.println("다운!! 기회가 " + i + "번 남았습니다.");
				continue;
			} else if(inputNum == ranNum) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("실패했습니다.. 정답은 " + ranNum + "입니다.");
				break;
			}
		}
		
		
		
		
	}

}
