package submit.submit0107;

public class Submit03_PARK_JAE_HUN {

	public static void main(String[] args) {
		// 주어진 문자열을 이용하여, 명함을 만들어보세요
		// split 사용
		
		String info = "박재훈, 010-9703-1493, jhjh5875@naver.com";
		String[] myInfo = info.split(",");
		String myName = myInfo[0];
		String myPhone = myInfo[1];
		String myEmail = myInfo[2];
		
		System.out.println("=================================");
		System.out.println("이름: " + myName);
		System.out.println("연락처: " + myPhone);
		System.out.println("이메일: " + myEmail);
		System.out.println("=================================");
	}

}
