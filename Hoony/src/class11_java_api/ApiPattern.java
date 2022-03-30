package class11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// 정규 표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰는 형식
		// 전화번호, 주민등록번호, 이메일 등과 같이 정해진 형식에 대해 정규 표현식 + Pattern을
		// 이용하여 검증할 수 있다.
		
		// 숫자만 존재하는지 검증
		String regex = "[0-9]"; // 0 ~ 9 중 문자 하나
		String example = "123"; // 검증할 문자열
		boolean result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		// 123이라는 문자는 x
		
		regex = "[0-9]*"; // 0 ~ 9 중 문자 하나
		example = "123"; // 검증할 문자열
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		// 숫자 검증 두번째
		regex = "\\d*";
		example = "124235476763";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		System.out.println("\n=============================================================\n");
		
		// 알파벳만 존재하는지 검증
		regex = "[a-zA-Z]*";
		example = "jae hun"; // 띄어쓰기가 있으면 안됨
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		// 띄어쓰기 포함
		regex = "[a-zA-Z ]*"; // Z뒤 띄어쓰기
		regex = "[a-zA-Z\\s]*";	// 정석대로면 공백을 나타내는 \\s
		example = "jae hun";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		System.out.println("\n=============================================================\n");
		
		// 한글 검증
		regex = "[가-힣]*";
		example = "재훈";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		System.out.println("\n=============================================================\n");
		
		// 비밀번호 패턴
		// 영어와 숫자로만 구성
		regex = "[a-zA-Z\\d]*";
		regex = "\\w*"; // "[a-zA-Z\\d]*"와 같다
		example = "jhjh5875";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		// 영어와 숫자 + 특수문자(필수 아님)
		regex = "[\\w!@#$%^&*)(_+]*";
		example = "nextIT!@";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		// 숫자, 영어 소문자 및 대문자, 특수문자가 각각 1개 이상
		// 포함하고, 비밀번호 자리가 8 ~ 20자리인지
		regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\w).{8,20}$"; // ^:문자의 시작 $:문자의 끝
		example = "nextiT123";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		// 6자리 숫자 비밀번호 중 3자리 이상 반복 금지
		regex = "^.*(\\d)\\1\\1.*$";
		example = "122234";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		regex = "[\\d]{6}";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		System.out.println("\n================================================\n");
		
		// 이메일 형식 확인
		regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$";
		example = "jhjh5875@naver.com";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
		// 연락처 형식 확인
		regex = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		example = "010-9703-1493";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과: " + result);
		
	}

}
