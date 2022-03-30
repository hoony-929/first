package class05_control;

public class LoopFor {

	public static void main(String[] args) {
		
		System.out.println("Test3");
		System.out.println("Test2");
		System.out.println("Test1");
		System.out.println("Start");
		// 반복문
		// for문
		for(int i = 0; i <10; i++) {
			System.out.println(i);
		}

		/*
		 * 디버깅 모드
		 * 코드라인 좌측 부분을 더블클릭 하면 breakpoint(초록색 점)이 생긴다. [단축키 Ctrl+ Shift + B]
		 * 토글 형식이라 더블클릭 또는 단축키로 생성/삭제 가능
		 * 코드를 한줄 한줄 실행해보면서, 변수에 어떤 값이 담기는지 확인 할 때 주로 사용
		 * 상단 Run 버튼 좌측 벌레 모양의 아이콘을 클릭하면 디버깅 모드가 실행
		 * 실행하면 디버깅 모드에 적함한 화면 스타일(Perspective)로 전환 할거냐는 메시지 창이 뜬다.
		 * OK 하면 디버깅 모드가 실행되어 현재 코드들이 위에서부터 실행되다가 breakpoint가 있는지점에 멈춰서
		 * 대기를 한다.
		 * 이후 상단의 Run안에 있는 step over [단축키 F6]을 실행하면 한줄 한줄 실행이 된다.
		 * 디버깅 모드를 종료하려면 Terminate - 콘솔창 빨간 네모버튼 [단축키 Ctrl + F2]
		 * 이후 원래 화면으로 돌아오려면 우측 상단의 Perspective 버튼에서 Java를 클하면 된다.
		 */
		
		// Ctrl + Shift + F11 을 하면 Coverage가 활성화 된다.
		// 코드 검사기능으로 작성을 잘했으면 녹색, 못했으면 적색으로 표기
		// 실수로 콘솔창을 껐을 경우 Window -> Show view
		
		// 1부터 20까지 더하기
		int num = 0;
		for(int i =1; i<=20; i++) {
			num += i;

		}
		System.out.println("1부터 20까지 더하면 " + num);
		
		for(int i = 0; i < 10; i = i +1) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i += 1) {
			System.out.println(i);
		}
		
		for(int i =0; i < 10; i += 2) {
			System.out.println(i);
		}
		
		for(double i = 0; i < 2; i += 0.2) {
			System.out.println(i);
			// 실수인 float과 double의 연산은 정확하지 않으므로 비추천!!!
		}
		
		System.out.println("\n============================================================\n");
		// 구구단 2단
		// 2 x 1 = 2
		// 2 x 9 = 18
		
		for(int i = 1; i < 10; i++) {
			System.out.println("2 x "+ i +" = "+ (2*i));
		}
		
		// 가끔 Console 창이 날라다닐때,
		// 우측 상단 perspective 버튼에서
		// Java Perspective 버튼 마우스 우클릭 - Rest
		// Window- Perspective - Reset Perspective
		
		// 1부터 10까지 중 홀수만 출력
		for(int i = 0; i<10; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		} // 총 10번 실행 
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		} // 총 5번 실행됨 -> 성능 증가 (프로그램 실행 속도 증가)
		System.out.println("\n====================================================\n");
		
		// 아래의 5층탑을 for문을 사용하여 만들어주세요
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		String star = "";
		for(int i=0; i<5; i++) {
			 star+="*";
			 System.out.println(star);
			
			}
		
		System.out.println("\n=====================================================\n");
		
		// % 나머지 연산 주로 사용할 때
		// for문 내에서 순환하는 숫자에 대해 사용
		
		System.out.println("\n=========================== 오뚜기 ==========================\n");
		
		// 국수 공장에서 면을 20cm ㅃ보고 있는데
		// 5cm마다 잘라주는 로직
		for(int i = 0; i < 20; i++) {
			System.out.println("||||||||");
			
			// i가 4, 9, 14, 19일 때 잘라야 한다.
			if((i == 4) || (i == 9) || (i == 14)) {
				System.out.println("-------------------");
			}
		}
		
		System.out.println("\n========================= 농심 =============================\n");
		// 라면 공장에서 면을 30cm 뽑고 있는데,
		// 6cm 마다 잘라주어야 한다.
		
		for(int i = 1; i<=30; i++) {
			if(i % 2 == 1) {
				System.out.println("////////");
			} else if(i % 2 == 0) {
				System.out.println("\\\\\\\\\\\\\\\\"); // '\'를 문자처럼 쓰려면 앞에 \가 하나 더 있어야 한다.
			} 
			// i가 6, 12, 18, 24 때 잘라야한다.
			// 6으로 나눴을 때 나머지가 0
			if(i % 6 == 0) {
				System.out.println("--------");
			}
//			try {
//				Thread.sleep(1000); // 1초는 1000밀리초
//				// 현재 프로그램을 실행중인 스레드를 괄호안 시간(단위: 밀리초, ms)만큼 잠깐 재웠다가 깨워준다
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		System.out.println("\n======================= 시계 ===========================\n");
		
		// 0시를 기준으로 매 시간마다 시간을 콘솔에 출력한다.
		// 100 시간
		for(int i = 0; i < 100; i++) {
			System.out.println(i%24);
		}
		
		System.out.println("\n======================= 조흔 시계 ===========================\n");
		
		// 시간 뿐 아니라 일자도 나타난다.
		int currentDay = 18; // 오늘 18일
		int currentTime = 3; // 3시라서
		// 100시간 후 며칠 몇시가 될까
		for(int i = 0; i < 100; i++) {
			int day = currentDay + (currentTime/24);
			int time = currentTime%24;
			currentTime++;
			System.out.println(day + "일 " + time +"시");
			}
		
		// 나머지 연산자 사용 팁 끝
		
		System.out.println("\n=========================== 유니코드 탐방 ==============================\n");
		
		// 유니코드에서 한글 시작('가' = 44032)부터 이후 10개를 출력하세요
		char charNum = 44032;
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + ". " + charNum);
			charNum++; // 순서
		}
		
		System.out.println("\n==============================거꾸로 for문============================\n");
		
		// 10부터 1까지 출력하시오
		int hiNum = 10;
		for(int i = 0; i < 10; i++) {
			System.out.println(hiNum);
			hiNum--;
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n========================트리 거꾸로==========================\n");
		
		star="*****";
		for(int i=0; i<5; i++) {
			System.out.println(star);
			star = star.replaceFirst("\\*", ""); 
			// *, ?, + 를 문자로 써야 에러가 안난다.
			// 문자로 쓰려면 '\\' 두개를 붙여야만 일반 문자로 인식
			// regex란 정규표현식(Regular Expression)을 의미
			// ex) 회원가입을 할 때 이름에 숫자 넣었는지 확인하고 경고
			// 연락처에 숫자만 넣었는지 확인
			// 아이디에 영어랑 숫자만 넣었는지
			// 비밀번호 패턴 (영어 대소문자, 숫자, 특수기호 각각 1개 이상)
		}
		
	for(int i=5; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		} System.out.println();
	}
		
	
	System.out.println("\n==================for문으로 String 사용하기=========================\n");
	
	// 숫자 문자열의 각 자리수를 더해서 출력
	String example = "54971285213";
	int result = 0;
	for(int i = 0; i < example.length(); i++) {
//		String strNum = example.substring(i,i+1);
//		int intNum = Integer.parseInt(strNum);
//		result += intNum;
		
//		int intNum2 = Integer.parseInt(example.substring(i,i+1));
//		result += intNum2;
		
		result += Integer.parseInt(example.substring(i,i+1));
	} System.out.println("각 자리수를 더한 결과는 " +result);
	
	
	System.out.println("\n======================'슈'가 몇 개?==============================\n");
//	String sususu = "슈슈슛ㅅ슈슈ㅠ슛.!! 시..심ㅅㄴ..슛슈ㅠ슈슈ㅠ슈";
//	int countSu = 0;
//	for(int i = 0; i < sususu.length(); i++) {
//		String strNum = sususu.substring(i,i+1);
//		if(strNum.equals("슈")) {
//			countSu++;
//		}
//	}
//	System.out.println("슈의 갯수는: " + countSu);
	
	String sususu = "슈슈슛ㅅ슈슈ㅠ슛.!! 시..심ㅅㄴ..슛슈ㅠ슈슈ㅠ슈";
	int countSu = 0;
	for(int i = 0; i < sususu.length(); i++) {
		String strNum = sususu.substring(i,i+1);
		if(strNum.equals("슈")) {
			countSu++;
		}
	}
	System.out.println();
	System.out.println("슈의 갯수는: " + countSu);
	
	System.out.println("\n======================== break 문 ============================\n");
	
	// i가 0부터 10까지 증가하는 for문에서 i가 5보다 커지게 되면 해당 for문을 종료
	
	for(int i = 0; i <= 10; i++) {
		if(i > 5) {
			break;
		}
		System.out.println(i);
	}
	
	System.out.println("\n====================================================\n");
	
	// 1부터 n까지 더한다고 했을 때 , 100 이상이 되는 n을 구하시요.
	int sumNum = 0;
	for(int i = 0; i < 100; i++) {
		sumNum += i;
		System.out.println(sumNum);
		
		if(sumNum >= 100) {
			System.out.println("100 이상이 되는 n은: " + i + "입니다.");
			break;
		}
	}
	
	System.out.println("\n=========================== continue 문 ==================================");
	
	// 구구단 7단
	// 너무 쉬운 2, 3, 4는 출력 안할래요.
	for(int i = 1; i < 10; i++) {
		if(i<5) {
			continue;
		}
		System.out.println("7 X " + i + " = " + (7*i));
	}
	
	// 대부분의 경우 continue문을 쓰지 않는다.
	System.out.println("\n==============================================================\n");
	
	for(int i = 1; i<10; i++) {
		if(i>4) {
			System.out.println("7 X " + i + " = " + (7*i));
		}
	}
	
	System.out.println("\n======================== 구구단 ===========================\n");
	
	// 2 x 2 = 4
	// 2 x 3 = 6
	// 2 x 9 = 18
	// 3 x 2 = 6
	// 3 x 3 = 9
	// 3 x 9 = 27
	
	// 이중 for문
	
	for(int i = 2; i < 10; i++) {
		for(int j = 1; j < 10; j++) {
			System.out.println(i+" X "+ j + " = " + (i*j));
		}
		System.out.println();
	}
	
	System.out.println("\n=======================================================\n");
	
	// 트리 만들기
	// 			*
	//		   **
	// 	 	  ***
	//		 ****
	//		*****
	star = "";
	for(int i = 0; i < 5; i++) {
		String blank = "";
		for(int j = 0; j < 5-i; j++) {
			blank += " ";
			// i가 0일때, star는 * 1개가 되고, blank는 공백 5개가 되어야 한다.
			// i가 1일때, star는 * 2개가 되고, blank는 공백 4개가 되어야 한다.
			// i가 2일때, star는 * 3개가 되고, blank는 공백 3개가 되어야 한다.
		}
		
		star += "*";
		System.out.println(blank + star);
	}
	
	
	
	
		
	}

}
