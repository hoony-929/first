package class12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3};
		
		// 에러가 발생하면 프로그램이 즉시 종료되기 때문에 웹 페이지라면 응답이 없다고 뜨며,
		// 앱의 경우 종료된다.
		try {
			System.out.println("인덱싱 시작");
			System.out.println(intArray[3]);
			System.out.println("인덱싱 끝"); // intArray[3] 지난 후 바로 캐치로 넘어가므로 안나옴
	   }catch(Exception e) {
		   e.printStackTrace();
		   // 에러가 콘솔창에 출력되는 시점과 syso가 콘솔창에 출력되는 시점은 다르다.
		   System.err.println("가나다라마바사");
		   System.out.println("아이고 망했다!");
		   // 웹사이트의 경우 에러 사이트로 이동시켜준다.
	   }
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			// 구체적인 예외를 지정할 수도 있다.
			System.out.println("인덱스 3은 없습니다.");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("배열의 길이: " + intArray.length);
		
		System.out.println("\n============================================================\n");
		
		int intA = 3;
		int intB = 0;
		
		try {
			System.out.println(intArray[3]);
			System.out.println(intA / intB);
		}catch(ArithmeticException a) {
//			a.printStackTrace();
			System.out.println("0으로 나눌 수 없음");
		}catch(ArrayIndexOutOfBoundsException e) {
			// 각 예외에 대한 다른 처리를 할 수 있다.
			System.out.println("인덱스를 넘기지 마세요");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		// 충분히 예상되는 에러의 경우 따로 exception 클래스를 만들어서 처리를 한다.
		// -> BizException
		
		try {
			System.out.println(ExceptionMethod.divide(5,0));
		}catch(BizException e) {
			System.out.println("예측된 에러발생");
			// 서버로 에러 코드와 에러 메시지를 보낸다.
//			e.printStackTrace();
			// 에러 메시지 읽기
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("\n=============================================================\n");
		
		try {
			ExceptionMethod.showName("123");
		}catch(BizException b) {
			System.out.println("에러코드: " + b.getErrCode());
			System.out.println("에러메시지: " + b.getMessage());
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("\n=============================================================\n");
		
		try {
			ExceptionMethod.dateMillSec("20220322");
		}catch(ParseException p) {
			System.out.println("날짜 포맷을 yyyy.MM.dd로 맞춰주세요");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}finally {
			// 예외가 발생하든 말든 실행할 명령어 입력
			// 일반적인 멸열문의 경우 finally에 굳이 쓸 이유가 없다.
			// 주로 try문에서 사용된 객체를 close할때 이용
			System.out.println("에러가 ㅂ라생하던 말던 실행됨"); // try/catch문 바깥에 쓰는거랑 똑같음
		}
		
		
		
		
	}

}
