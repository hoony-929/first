package class10_extends_interface.starcfaft;

import java.util.ArrayList;

public class StarcraftMain {

	public static void main(String[] args) {
		Zealot zealot = new Zealot();
		System.out.println(zealot.toString());
		
		HighTemplar highTemplar = new HighTemplar();
		System.out.println(highTemplar.toString());
		
		highTemplar.sionicStorm();
		highTemplar.halluciNation();
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		Zealot zealot7 = new Zealot();
		
		// 질럿들 드래그로 선택, 질럿 리스트로 담기
		ArrayList<Zealot> zealotList = new ArrayList<Zealot>();
		zealotList.add(zealot);
		zealotList.add(zealot2);
		zealotList.add(zealot3);
		zealotList.add(zealot4);
		zealotList.add(zealot5);
		zealotList.add(zealot6);
		zealotList.add(zealot7);
		
		
		// 선택된 질럿들 이동 명령
		for(int i = 0; i < zealotList.size(); i++) {
			zealotList.get(i).move(500, 120);
		}
		
		// 다형성
		// 하나의 객체가 여러가지 타입을 가질 수 있는 것
		// 부모 클래스 타입의 참조 변수로(ProtossUnit, StarUnit)
		// 자식 클래스 타입의 인스턴스(= 객체, zealot 객체)를 참조 할 수 있는 것
		
		// 클래스 간의 형변환
		// 자식 객체에서 부모 객체로는 형변환이 가능하다
		ProtossUnit protossUnit = zealot;	//	long longVal = 304040 요런 느낌쓰 -> 자동 형변환
		ProtossUnit proUnit = (ProtossUnit)zealot; // 강제 형변환
		
		// 자식 객체에서 조부모(상속 클래스보다 더 위인 상속클래스) 객체로 형변환이 가능하다.
		StarUnit starUnit = zealot;
		
		
		// 다시 드래그 선택
		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(zealot7);
		starList.add(highTemplar);
		
		for(int i =0; i < starList.size(); i++) {
			starList.get(i).move(60, 70);
		}
		
		
		
		
//		HighTemplar ht = starList.get(7);
		StarUnit ht = starList.get(7); // 상위 계층을 이용했을 경우 값을 꺼냈을때 상위계층걸로
		System.out.println(starList.get(7).getName()); // 하이템플러
//		StarList.get(7).sionic..... 사이오닉 스톰 시전 불가
		
		// 다시 형변환
		((HighTemplar)ht).sionicStorm(); // 사이오닉 스톰 시전 가능
		
		StarUnit puma = new StarUnit("퓨마", 0, 40, 0, 0, 0, 0); // 맵 상 중립 동물
		
		// Instanceof 객체의 타입을 확인하는데 사용
		
		// 퓨마가 프로토스 유닛이 될 수 있는가 질럿이 될 수 있는가
		// 일반적으로 부모 객체는 자식 객체로 형변환 할 수 없습니다. puma는 StarUnit이기 때문에 부모 객체임
		System.out.println(puma instanceof ProtossUnit); // false
		System.out.println(puma instanceof Zealot); 		// false
		
		// 자식 객체는 부모 객체로 형변환이 가능하다
		System.out.println(highTemplar instanceof ProtossUnit); // true
		System.out.println(highTemplar instanceof StarUnit);		// true
		
		
		// 부모 객체로 형변호나 되었던 자식 객체는 다시 자식 객체로 형변환이 가능하다.
		System.out.println(starUnit instanceof Zealot); 		 // true
		System.out.println(starUnit instanceof HighTemplar); // false
		
		
		// 로직 안에서 구현을 해야함 하이템플러를 위 7번에서 찾는건 말이 안된다!
		for(int i =0; i< starList.size(); i++) {
			// 하이템플러인지 ㅣ체크 후 사이오닉 스톰 메소드 실행
			if(starList.get(i).getName().equals("하이템플러")) {
				((HighTemplar)starList.get(i)).sionicStorm();
			}
			
			if(starList.get(i) instanceof HighTemplar) { // for문을 돌리다 형변환 된 하템이 된다면 사이오닉 스톰 시전
				((HighTemplar)starList.get(i)).sionicStorm();
			}
		}
		
		
		// StarUnit을 상속 받는 SiegeTank 클래스를 만들어 주세요
		// SiegeTank는 siegeMode라는 메소드를 가지고 있고,
		// siegeMode를 실행하면 damage가 70이 되고,
		// 공격 사거리가 12로 됩니다.
		
		SiegeTank siegeTank = new SiegeTank();
		System.out.println(siegeTank.toString());
		siegeTank.sieheMod();
		
		
		
		
		
	}// main 함수 괄호

}
