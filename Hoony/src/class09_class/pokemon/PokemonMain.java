package class09_class.pokemon;

import java.util.ArrayList;
import java.util.Scanner;

import class09_class.Constants;

public class PokemonMain {

	public static void main(String[] args) {
		ArrayList<Pokemon> pokemonPool = new ArrayList<Pokemon>();
		
		pokemonPool.add(new Pokemon("피카츄", "백만 볼트", 50, 200, Constants.TYPE_THUNDER, 50));
		pokemonPool.add(new Pokemon("라이츄", "천만 볼트", 200, 400, Constants.TYPE_THUNDER, 200));
		pokemonPool.add(new Pokemon("파이리", "불꽃 발사", 50, 200, Constants.TYPE_FIRE, 50));
		pokemonPool.add(new Pokemon("리자드", "불꽃 난사", 100, 300, Constants.TYPE_FIRE, 100));
		pokemonPool.add(new Pokemon("리자몽", "파이어 브레스", 200, 400, Constants.TYPE_FIRE, 200));
		pokemonPool.add(new Pokemon("꼬부기", "거품 광선", 50, 200, Constants.TYPE_WATER, 50));
		pokemonPool.add(new Pokemon("어니부기", "물 대포", 100, 300, Constants.TYPE_WATER, 100));
		pokemonPool.add(new Pokemon("거북왕", "하이드로 펌프", 200, 400, Constants.TYPE_WATER, 200));
		pokemonPool.add(new Pokemon("이상해씨", "덩쿨 채찍", 50, 200, Constants.TYPE_PLANT, 50));
		pokemonPool.add(new Pokemon("이상해풀", "나뭇잎 베기", 100, 400, Constants.TYPE_PLANT, 100));
		pokemonPool.add(new Pokemon("이상해꽃", "솔라빔", 200, 400, Constants.TYPE_PLANT, 200));
		
		Trainer minwoo = new Trainer("민우", 1000);
		Trainer jihye = new Trainer("지혜", 1000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("                                  ,'\\\n" + 
				"    _.----.        ____         ,'  _\\   ___    ___     ____\n" + 
				"_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" + 
				"\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" + 
				" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" + 
				"   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" + 
				"    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" + 
				"     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" + 
				"      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" + 
				"       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" + 
				"        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" + 
				"                                `'                            '-._|");
		
		// 6번의 경매 - 랜덤으로 포켓몬을 꺼내오기
		// 경매 후 배틀 이긴 쪽이 승자
		for(int i = 0; i < 6; i++) {
			// 0부터 pool 사이즈의 -1가지 중 랜덤하게 나온다
			int randInt = (int)(Math.random()*pokemonPool.size());
			
			System.out.println((i + 1) + "번째 경매 =======================");
			System.out.println(pokemonPool.get(randInt));
			System.out.println("=============================");
			
			int bet = 0;
			while(true) {
				System.out.println("보유 현황 ===============================");
				minwoo.showPokemonList();
				jihye.showPokemonList();
				System.out.println("===================================");
				// 민우씨 턴
				System.out.println("현재 입찰 금액: " + bet);
				System.out.println(minwoo.getName() + "님, 소지금(" + minwoo.getMoney() + ")");
				System.out.print("입찰 가격 입력: ");
				
				int inputBet = Integer.parseInt(sc.nextLine());
				minwoo.setBet(inputBet);
				
				// 입찰을 포기하길 원한다면 -1 입력
				if(inputBet != -1) {
					bet = minwoo.getBet();
				} else {
					break;
				}
				
				// 지혜씨 턴
				System.out.println("현재 입찰 금액: " + bet);
				System.out.println(jihye.getName() + "님, 소지금(" + jihye.getMoney() + ")");
				System.out.print("입찰 가격 입력: ");
				
				inputBet = Integer.parseInt(sc.nextLine());
				jihye.setBet(inputBet);
								
				// 입찰을 포기하길 원한다면 -1 입력
				if(inputBet != -1) {
					bet = jihye.getBet();
				} else {
					break;
				}
				
			}
			
			if(minwoo.getBet() != -1) {
				System.out.println(minwoo.getName() + "님이 " + pokemonPool.get(randInt).getName() + "을(를) "
						 + minwoo.getBet() + "원에 구매하셨습니다.");
				
//				minwoo.setMoney(minwoo.getMoney() - minwoo.getBet()); // 너무 복잡하므로 메소드를 하나 만들기
				minwoo.buyPokemon(pokemonPool.get(randInt));
			}
			if(jihye.getBet() != -1) {
				System.out.println(jihye.getName() + "님이 " + pokemonPool.get(randInt).getName() + "을(를) "
						 + jihye.getBet() + "원에 구매하셨습니다.");
				
//				minwoo.setMoney(minwoo.getMoney() - minwoo.getBet()); // 너무 복잡하므로 메소드를 하나 만들기
				jihye.buyPokemon(pokemonPool.get(randInt));
			}
		}
		
		
		while(true) {
		minwoo.showPokemonList();
		jihye.showPokemonList();
		
		for(int i = 0; i < 3; i++) {
			Pokemon one = minwoo.getPokemonList().get(i);
			Pokemon two = jihye.getPokemonList().get(i);
			
			one.attack(two);
			two.attack(one);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		if(minwoo.checkPokemon() >= 2 && jihye.checkPokemon() >= 2) {
			System.out.println("무승부");
			break;
		} else if(minwoo.checkPokemon() >= 2) {
			System.out.println(jihye.getName() + "승리!");
			break;
		} else if(jihye.checkPokemon() >= 2) {
			System.out.println(minwoo.getName() + "승리!");
			break;
		}
		
	 }
		
	}

}
