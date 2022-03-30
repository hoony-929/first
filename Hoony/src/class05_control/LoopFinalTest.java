package class05_control;

public class LoopFinalTest {

	public static void main(String[] args) {
		// 복습시간
		
		// 팩토리얼
		// 4! = 4 x 3 x 2 x 1 = 24
		
		// for문을 이용해서 10 팩토리얼의 값을 출력
//		int fac = 1;
//		for(int i = 1; i <= 10; i++) {
//			fac = fac * i;
//			System.out.println(i + "! = " + fac);
//		}

		System.out.println("\n==================================================\n");
		// 15 픽토리얼을 구하라
//		BigInteger fac = BigInteger.ONE;
//		for(int i = 1; i <= 15; i++) {
//			fac = fac.multiply(BigInteger.valueOf(i));
//			System.out.println(i + "! = " + fac);
//		}
		
//		long result =1;
//		for(int i = 1; i <= 15; i++) {
//			result = result * i;
//			System.out.println(i + "! = " + result);
//		}
		System.out.println("\n===================== 룰렛 이벤트 ==========================\n");
		
		// 룰렛을 아주 힘차게 돌렸더니
		// 5834도가 돌아갔다.
		// 한바퀴 360
		
		// 그렇다면 룰렛이 멈추고난 각도에 따른 경품이 뭔지 출력을 해주시고, 총 몇바퀴 돌아갔는지도 출력하시오
		// 0도 초과 ~ 60도 이하: 사탕
		// 60도 초과 ~ 120도 이하: 초콜릿
		// 120도 초과 ~ 180도 이하: 쿠키
		// 180도 초과 ~ 240도 이하: 콜라
		// 240도 초과 ~ 300도 이하: 아이스크림
		// 300도 초과 ~ 360(=0)도 이하: 커피머신
		
//		System.out.println(i +"바퀴");
//		System.out.println("경품: "+);
		
		int rullDeg = 5834;
		int giftDeg = rullDeg%360;
		System.out.println(rullDeg/360 + "바퀴");
		if(giftDeg <= 60 || giftDeg > 0) {
			System.out.println("경품: 사탕");
		} else if(giftDeg > 60 || giftDeg <= 120) {
			System.out.println("경품: 초콜릿");
		} else if(giftDeg > 120 || giftDeg <= 180) {
			System.out.println("경품: 쿠키");
		} else if(giftDeg > 180 || giftDeg <= 240) {
			System.out.println("경품: 쿠키");
		} else if(giftDeg > 240 || giftDeg <= 300) {
			System.out.println("경품: 아이스크림");
		} else if(giftDeg > 300 || giftDeg <= 360 || giftDeg == 0) {
			System.out.println("경품: 커피머신");
		}

		
		
		
		
	}

}
