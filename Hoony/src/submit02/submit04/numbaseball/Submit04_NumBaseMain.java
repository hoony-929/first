package submit02.submit04.numbaseball;

import java.util.Arrays;
import java.util.Scanner;


/*
 *  컴퓨터 랜덤 3개 숫자 맞추기(1~9)
 *  자리와 숫자가 같은 경우 Strike
 *  자리가 다르고 숫자는 같은 경우 Ball
 *  
 */
public class Submit04_NumBaseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Submit04_ComNum cn = new Submit04_ComNum();
		// 컴퓨터 랜덤 지정수를 정답으로
		int[] answer = cn.getNum();
		// 사용자 입력 값 수
		int[] inputNum = new int[3];
		// 시도 횟수
		int tryNum = 10;
		int strike = 0;
		int ball = 0;
		
		System.out.println("============================== 숫자 야구 규칙 ==============================");
		System.out.println("기회는 10번이며 각각 다른 3자리 수를 입력하면 됩니다.(1 ~ 9)");
		System.out.println("같은 자리에 같은 숫자라면 Strike, 자리는 다르나 숫자가 같다면 Ball이 출력됩니다.");
		System.out.println();
		
		while(strike != 3) {
			strike = 0;
			ball = 0;
			
			System.out.println("숫자 3개를 입력해 주세요(띄어쓰기) " + "(남은 기회: " + tryNum + ")");
			// 입력
			for(int i = 0; i < inputNum.length; i++) {
				inputNum[i] = sc.nextInt();
				// 잘못 입력 했을 때
				if(inputNum[i] >= 10 || inputNum[i] < 0) {
					System.out.println("잘못 입력했습니다. 다시 입력해주세요");
					i--;
					continue;
				}
				for(int j = 0; j < i; j++) {
					if(inputNum[i] == inputNum[j]) { // 중복된 숫자의 경우
						System.out.println("값이 중복되었습니다. 다시 입력해주세요");
						i--;
					}
				}
				System.out.print(inputNum[i]);
			}System.out.println("");
			
			// strike, ball 수 체크
			for(int i = 0; i < inputNum.length; i++) {
				for(int j = 0; j < inputNum.length; j++) {
					if(inputNum[i] == answer[j]) { // 자리는 다르고 숫자가 같은 경우
						if(i == j) { // 자리와 숫자가 같은 경우
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			// 출력문
			System.out.println(strike + " Strike " + ball + " Ball");
			tryNum--;
			
			// 결과
			if(strike == 3) {
				System.out.println("축하합니다! 정답을 " +(10 - tryNum) + "번만에 맞추셨습니다.");
				break;
			} else if(tryNum == 0) {
				System.out.println("아쉽습니다. 실패하셨습니다.");
				System.out.println("정답은" + Arrays.toString(answer) + "입니다.");
				break;
			}
		}
		
		sc.close();
		

	}

}
