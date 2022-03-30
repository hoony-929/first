package class05_control;

public class Conditional {

	public static void main(String[] args) {
		// 조건문
		
		// if문
		int intVar=3;
		if(intVar>0) {
			System.out.println("intVar이 0보다 큽니다.");
		}
		if(intVar>0) {System.out.println("intVar이 0보다 큽니다.");}
		// 블록{} 안 명령어가 한 줄이면 블록을 생략해도 정상 작동
		if(intVar>0) System.out.println("intVar이 0보다 큽니다.");

		System.out.println("\n===============================================================\n");
		
		intVar = 0;
		if(intVar<0) {
			System.out.println("intVar이 0보다 작습니다.");
		} else {
			System.out.println("intVar은 0보다 작지 않습니다.");
		}
		
		if(intVar < 0) {
			System.out.println("intVar이 0보다 작습니다.");
		} else if (intVar==0) {
			System.out.println("intVar은 0입니다.");
		} else {
			System.out.println("intVar은 0보다 큽니다.");
		}
		
		// 웹 브라우저에서 사용자가 로그인을 하면 해당 브라우저의 세션 스토리지에 정보가 저장이 되는데,
		// 이 정보를 이용해서 로그인 된 화면 혹은 로그인 하지 않은 화면을 보여준다.
		
		// jsp(자바 서버 페이지) 때는 세션에서 정보를 가져온다.
//		String loginId = "jhjh5875"; 
//		if(loginId != null) {
//			System.out.println("로그인 상태의 화면을 보여준다.");
//		} else {
//			System.out.println("로그인 화면으로 이동");
//		}
		
		// 리모콘의 전원버튼의 경우 버튼 하나로 on/off가 다 가능하다.
		// 해당 버튼 이벤트에 전원의 상태를 체크하는 기능이 있다
		
		boolean isPowerOn = false;
		// 전원 버튼을 눌렀을때의 로직
		if (isPowerOn) {// isPowerOn이 true면 TV가 켜져있다.
			System.out.println("TV를 끕니다.");
			isPowerOn = !isPowerOn;
		} else {
			System.out.println("TV를 켭니다.");
			isPowerOn = !isPowerOn;
		}
		
		// boolean의 true/false를 스위치의 in/off 처럼 사용하는
		// boolean 변수를 토글(toggle) 혹은 플래그(flag)라고 한다.
		
		System.out.println("\n=======================================\n");
		// 주민번호 뒷자리의 첫번째 숫자로 성별 찾기
		String hisIdBack = "1367423";
		int idNumFirst = Integer.parseInt(hisIdBack.substring(0,1));
		if(idNumFirst %2 == 0) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("남자입니다.");
		}
		
		// 이중 삼항 연산자
		int score = 85;
		String grade = "";
		// score가 90점보다 크면 grade는 A, 80점보다 크면 grade는 B, 나머지는 C
		if(score > 90) {
			grade = "A";
		} else if(score > 80) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println(grade + "등급 입니다.");
		
		// 순서에 주의해야 하는 경우
		score = 92;
		if(score> 80) { // 이미 80보다 커서 첫번째 if문에서 끝나버림
			grade ="B";
		} else if(score > 90) {
			grade = "A";
		} else {
			grade = "C";
		}
		System.out.println(grade + "등급 입니다.");
		
		// 명확히 하거나, 순서를 잘 생각해야한다.
		if(score >80 && score < 90) {
			grade = "B";
		} else if (score >90) {
			grade = "A";
		} else {
			grade = "C";
		}
		System.out.println(grade + "등급 입니다.");
		
		// 사용자가 회원가입을 할 때, 입력 정보를 전부 확인한 후에 회원가입 버튼을 활성화 시킨다.
		String name = "";
		String phone = "";
		String age = ""; //14세 이상이어야 한다.
		
		// level 1
	if(name.length() > 0) {	// isNotEmpty와 같다.
		if(phone.length() == 11 || phone.length() == 10) {
			if(Integer.parseInt(age) >= 14) {
				System.out.println("회원가입 버튼 활성화");
			}else {
				System.out.println("회원가입 불가");
			}
			}else {
				System.out.println("회원가입 불가");
			}	
			}else {
				System.out.println("회원가입 불가");
			}
		
		// level 2
		boolean isGood = false;
		if(name.length() > 0) {
			if(phone.length() == 11 || phone.length() == 10) {
				if(Integer.parseInt(age) >= 14) {
					isGood = true;
				}
			}
		}
		
		if(isGood) {
			System.out.println("회원가입 버튼 활성화");
		} else {
			System.out.println("회원가입 불가");
		}
		
		// level 3
		if((name.length() > 0) && (phone.length() == 11 || phone.length() == 10)
				&& (Integer.parseInt(age) >= 14)) {
			System.out.println("회원가입 버튼 활성화");
		}else {
			System.out.println("회원가입 불가");
		}
		
		System.out.println("\n=============================================================\n");
		// 값을 매칭하는 경우가 많을 때,
		
		int month = 0; // 나의 교욱기간(단위: 월)
		if(month == 0) {
			System.out.println("열심히 배우고 있습니다.");
		} else if(month == 1) {
			System.out.println("오라클 DB 마스터ㅎ");
		} else if(month == 2) {
			System.out.println("jvav 마스터ㅎㅎ");
		} else if(month == 3) {
			System.out.println("javascript 마스터ㅎㅎㅎ");
		} else if(month == 4) {
			System.out.println("jsp 마스터ㅎㅎㅎㅎ");
		} else if(month == 5) {
			System.out.println("팀프로젝트ㅜㅜ");
		} else {
			System.out.println("수료!!!!! 고생하셨습니다~");
		}
		
		// switch문
		// switch() 괄호 안에는 char, int, String 타입의 변수만 적용이 가능하다
		
		month =3;
		switch(month) {
			case 0:
				System.out.println("열심히 배우고 있습니다.");
				break;
			case 1:
				System.out.println("오라클 DB 마스터ㅎ");
				break;
			case 2:
				System.out.println("jvav 마스터ㅎㅎ");
				break;
			case 3:
				System.out.println("javascript 마스터ㅎㅎㅎ");
				break;
			case 4:
				System.out.println("jsp 마스터ㅎㅎㅎㅎ");
				break;
			case 5:
				System.out.println("팀프로젝트ㅜㅜ");
				break;
			default:
				System.out.println("수료!!!!! 고생하셨습니다~");
				
		}
		
		
		
	}
}
