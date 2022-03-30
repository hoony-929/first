package class03_system_into;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// 콘솔에 텍스트 출력하기
		System.out.println("이미 알고 있는것");	// 문자열 끝 자동으로 줄바꿈
		System.out.print("이건 뭔가요?");		// 해당 문자열만을 출력
		System.out.printf("이건 또 뭐죠?");	// 해당 문자열을 출력하지만, 문자열의 형식(format)을 바꿀 수 있다.
		
		System.out.println("==============================================================");
		System.out.println("==============================================================");
		
		// 제어 문자
		// 문자열 내에 역슬래시 (\)를 이용하여 특정 기능을 사용할수 있다.
		
		// \t 탭
		System.out.println("*\t*\t*");
		System.out.println("**\t**\t**");
		System.out.println("***\t***\t***");
		
		// \n 줄바꿈
		System.out.print("나도 println이 되고 싶어\n");
		System.out.println("완료");
		
		// \(기능이 있는 문자)
		System.out.println("제어문자를 사용하려면 \\를 써야합니다.");
		System.out.println("소크라테스가 말하길... \"너자신을 알라\"");
		
		// 특수문자도 가능
		System.out.println("♡"); // ㅁ+한자
		
		// printf 는 포맷 문자열과 함께 사용 / %d는 정수를 의미 / %s는 문자를 의미
		System.out.printf("%d 명이 수업을 듣고 있습니다.\n", 21);
		System.out.printf("%d명이 수업을 %d 시간째 듣고 있습니다.\n", 21, 8);
		System.out.printf("%d명이 %s을 %d시간째 듣고 있습니다.\n", 21, "수업", 8);
		
		int stuNum = 21;
		String strVar = "수업";
		int intVar = 8;
		System.out.println(stuNum +"명이 "+strVar+"을 "+intVar+"시간째 듣고 있습니다.");
		
		System.out.printf("%02d장_표준입출력\n", 3);		// 2자리 기준으로 2자리가 안차면 0을 넣어준다
		System.out.printf("%03d장_표준입출력\n", 3);		// 2자리 기준으로 2자리가 안차면 0을 넣어준다
		System.out.printf("%03d장_표준입출력\n", 31);		// 3자리 기준으로 2자리가 안차면 0을 넣어준다
		
		System.out.printf("%.03f\n", 3.14);	// 소수 셋째자리까지 없다면 0을 출력
		System.out.printf("%.1f\n", 3.14);		// 반올림 해서 소수 첫째자리까지
		
		System.out.println("===========================================================================");
		
		// 표준 입력 - 사용자가 입력한 값을 받아올 수 있다.
		System.out.printf("이름을 입력해 주세요: \n");
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.nextLine();
		
		System.err.println(inputText + "님 환영합니다."); // err 콘솔창에 빨갛게 표시
	}

}
