package class09_class.practice.updownbet;

import java.util.Scanner;

// up & down 맞추고 베팅 금액 가져오기
public class UpDownBetMain {

	public static void main(String[] args) {
		
		Player player1 = new Player("플레이어1", 1000);
		Player player2 = new Player("익명", 1000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============== UP & DOWN ===============");
		System.out.println("기회는 총 5번이며 숫자는 1 ~ 50중 하나입니다.");
		System.out.println("매번 베팅 금액을 걸고 정답자가 베팅 금액을 가져갑니다.");
		System.out.println("=========================================");
		
		int randNum = (int)((Math.random() * 50)+1);
		int bet1 = 0;
		int bet2 = 0;
		
		for(int i = 5; i > 0; i--) {
						
			System.out.println((6 - i)  + "번째 플레이");
			
					
				// My 턴
				System.out.println("현재 베팅 금액: " + bet1);
				System.out.println(player1.getName() + "님, 소지금(" + player1.getMoney() + ")");
				System.out.println("베팅 금액 입력: ");
				int inputBet = Integer.parseInt(sc.nextLine());

				bet1 += inputBet;
				player1.setMoney(player1.getMoney() - inputBet);
				
				
								
				System.out.println("맞출 숫자 입력: ");
				int inputNum = Integer.parseInt(sc.nextLine());
				
				// 상대방 턴
				System.out.println("현재 베팅 금액: " + bet2);
				System.out.println(player2.getName() + "님, 소지금(" + player2.getMoney() + ")");
				System.out.println("베팅 금액 입력: ");
				int inputBet2 = Integer.parseInt(sc.nextLine());
				bet2 += inputBet2;
				player2.setMoney(player2.getMoney() - inputBet2);
				
				System.out.println("맞출 숫자 입력: ");
				int inputNum2 = Integer.parseInt(sc.nextLine());
				
				
				// 결과
				
				int allBet = bet1 + bet2;
				
				if(inputNum > randNum) {
					System.out.println("다운! 기회가 " + (i - 1) + "번 남았습니다.");
					System.out.println("");
//					player1.setMoney(player1.getMoney() - player1.setBet(inputBet));
				} else if(inputNum < randNum) {
					System.out.println("업! 기회가 " + (i - 1) + "번 남았습니다.");
					System.out.println("");
				} else if(inputNum == randNum) {
					System.out.println("정답은 " + randNum + "입니다.");
					System.out.println("축하합니다! "+ player1.getName() + "님이 " + (6 - i) + "번만에 맞추셨습니다.");
					
					System.out.println("총 금액 " + allBet +"을 가져가셨습니다!");
					break;
				} else {
					System.out.println("아쉽습니다.. 탈락입니다..");
					System.out.println("정답은 " + randNum + "입니다.");
					break;
				}
				
				if(inputNum2 > randNum) {
					System.out.println("다운! 기회가 " + (i - 1) + "번 남았습니다.");
					System.out.println("");
				} else if(inputNum2 < randNum) {
					System.out.println("업! 기회가 " + (i - 1) + "번 남았습니다.");
					System.out.println("");
				} else if(inputNum2 == randNum) {
					System.out.println("정답은 " + randNum + "입니다.");
					System.out.println("축하합니다! "+ player2.getName() + "님이 " + (6 - i) + "번만에 맞추셨습니다.");
					player2.setBet(allBet);
					System.out.println("총 금액 " + allBet +"을 가져가셨습니다!");
					break;
				} else {
					System.out.println("아쉽습니다.. 탈락입니다..");
					System.out.println("정답은 " + randNum + "입니다.");
					break;
				}
						
		}
		
	} // main 함수

}
