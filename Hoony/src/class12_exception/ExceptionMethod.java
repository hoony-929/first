package class12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

// 에러 처리할 메소드들을 가지는 클래스
public class ExceptionMethod {
	
	// 입력받은 두 숫자를 나눈 값 리턴
	public static int divide(int numA, int numB) throws BizException {
		
		if(numB == 0) {
			throw new BizException("numB는 0이외에 숫자를 입력하세요");
		}else {			
			return numA / numB;
		}		
	}
	
	// 입력받은 이름을 콘솔에 출력하는 메소드
	// 만약 입력받은 이름이 숫자거나, empty면 throw BizExcedption
	
	public static void showName(String name) throws BizException {
		String regex = "[a-zA-Z가-힣]*";
		
		if(name.length() == 0) {
			throw new BizException(ErrorConstants.API_0001, "이름을 한 글자 이상 입력해 주세요. 입력한 값:" + name);
		}else if(!Pattern.matches(regex, name)) {
			throw new BizException(ErrorConstants.API_0002, "숫자를 입력하지 마세요. 입력한 값: " + name);
		}else {
			System.out.println(name);
		}	
	}
	
	// 날짜 문자열을 입력하면 밀리초로 바꿔서 리턴해주는 함수
	// yyyy.MM.dd										메서드 안에서 try, catch를 사용하지 않겠다
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}
	
	
}
