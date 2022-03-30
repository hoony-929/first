package calss04_operator;

public class OperatorQuestion {

	public static void main(String[] args) {
		// 삼항연산자를 이용해서
		// 아래의 주민번호 뒷자리의 첫번째 숫자에 따른 성별을 받는 gender 변수에 담아 콘솔에 출력해보세요
		// 항상 주민번호 뒷자리 첫번째 숫자가 홀수면 남성, 짝수면 여성
		String hisIdBack = "1231476";
		String herIdBack = "4254654";
		
		int hisFirst = Integer.parseInt(hisIdBack.substring(0,1));
		System.out.println(hisFirst);
		int herFirst = Integer.parseInt(herIdBack.substring(0,1));
		System.out.println(herFirst);
		
		String gender1 = (hisFirst % 2 == 1) ? "남자" : "여자";
		String gender2 = (herFirst % 2 == 1) ? "남자" : "여자";
		
		System.out.println(gender1);
		System.out.println(gender2);
		
		
		
	}

}
