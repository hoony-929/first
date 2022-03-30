package classstart;

public class VariableMain {

	public static void main(String[] args) {
		
		final String NEXT_IT_ADDRESS = "대전광역시 중구 희영빌딩";
		System.out.println(NEXT_IT_ADDRESS);
		
		char charVal = 'a';
		System.out.println(charVal+1);
		
		// 변수를 선언하면서 값을 부여한다.
		// 값을 초기화 한다.(Initialization -> Init)
		int numOne = 1;
		System.out.println(numOne);
		
		// 변수를 선언만하고 값을 부여하지 않을 수도 있다.
		int numTwo;   // 변수를 선언
		
		numTwo = 2;   // 변수에 값을 저장
		System.out.println(numTwo); // 변수 사용

		// 변수의 다중 선언
		int numThree, numFour;
		numThree = 3;
		numFour = 4;
				
		// 변수의 다중 선언은 되지만, 값을 넣어주면서 선언할 수 는 없다.
//		int numFive, numSix = 5,6; 자바는 안됨
				
		System.out.println("==================================================");
				
		// 문자열(String)
		// String 은 클래스이므로 다양한 함수를 내장하고 있다.
		String fruits = "Apple, Banana, Carrot";
		System.out.println(fruits);
		
		// .length()
		// 해당 문자열의 길이를 리턴
		System.out.println(fruits.length());
		
		// .charAt(인덱스)
		// 인덱스는 문자열에서 몇 번재에 해당하는 자를 말한다.
		// 인덱스는 0부터 시작
		// 해당 문자열에서 인덱스에 해당하는 문자(char)를 리턴
		System.out.println(fruits.charAt(0));
		
		// .indexOf(문자열)
		// 해당 문자열에서 괄호 안에 있는 문자에 인덱스 위치를 리턴
		// 해당 문자열을 포함하지 않는다면 -1를 리턴
		System.out.println(fruits.indexOf("Banana"));
		System.out.println(fruits.indexOf("banana"));
		
		// .substring(시작 인덱스, 끝 인덱스)
		// 해당 문자열을 시작 인덱스에서 끝 인덱스 '전'까지 자른다.
		System.out.println(fruits.substring(7, 14));	// 인덱스 7부터 13까지를 리턴한다.
		
		// .replace(바뀔 문자열, 바꾸고 싶은 문자열)
		// 해당 문자열에서 바뀔 문자열을 바꾸고 싶은 문자열로 교체
		System.out.println(fruits.replace("Carrot", "Orange"));
		System.out.println(fruits.replace(" ", ""));
		
		// .trim()
		// 해당 문자열의 양 끝에 존재하는 모든 공백을 제거해준다.
		String strWorld = "              The World           !!    ";
		System.out.println(strWorld.trim());
		
		// .toUpperCase
		// 해당 문자열에 존재하는 알파벳들을 전부 대문자로 바꿔준다.
		// .toLowCase 전부 소문자로
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase());
		
		// .concat(문자열)
		// 해당 문자열의 괄호 안에 있는 문자열 뒤에 붙인다.
		System.out.println(fruits.concat(", DDankong")); // 굳이 안씀
		System.out.println(fruits + ", DDankong");
		
		// String은 참조 타입이므로 null 값을 가질 수 있다.
		String anything = null;
		String nothing = ""; // 둘 다 빈 값이지만, 데이터가 없는 null과 빈 데이터인 "" (empty)는 엄연히 다르다.
		System.out.println(anything);
		System.out.println(nothing);;
		
		System.out.println("===================================================");
		
		System.out.println(fruits);
		
		fruits = fruits.substring(7);	//괄호안의 인덱스 전까지 해당 문자열을 자른다. / '='는 오른쪽에 있는 변수를 왼쪽에 있는 변수에 삽입
		//fruits <- fruits.substring(7);
		System.out.println(fruits);
		
		// byte 는 -128부터 127까지만 담을 수 있으므로
		byte byteNum = 127;
		byteNum++; // 1을 더한다.
		byteNum += 1;	// 1을 더한다.
		System.out.println(byteNum); // -128부터 127이기 때문에 127에서 1을 더하면 -128이 되고, 거기서 1을 더하여 -127
		
		// 형 변환(Casting)
		int intVal = 17;
		double doubVal = 3.14;
		
		double doubMulVal = intVal * doubVal;	// int 곱하기 double 은 double 타입으로 자동 형변환이 된다.
		// (타입) (값) 을 이용하여 강제 형변환이 가능하다.
		int intMulVal = (int) (intVal * doubVal);
		
		System.out.println(doubMulVal);	// 값이 실수로 잘 나옴
		System.out.println(intMulVal);	// 값이 int(정수)로 형 변환 되어 소수점이 날라감
		
		float floatMulVal = intVal * 3.14f;
		System.out.println(floatMulVal);
		
		long longVar = 20000L; // l 붙이기 귀찮으니 정수는 int
		int intVar = 20000;
		
		float floVar = 3.14F; // f 붙이기 귀찮으니 실수는 double
		double douVar = 3.14;
		
		// 강제 형 변환 (숫자 <-> 문자열)
		String countingStar = "17";
		String countStar = countingStar + 1;
		System.out.println(countStar);
		
		// 문자열을 숫자로 형 변환
		// Integer.parseInt(문자열)
		int intCountStar = Integer.parseInt(countingStar);	// 문자열 "17"이 정수 17로 
		intCountStar = intCountStar + 1;	// 17 + 1 = 18
		System.out.println(intCountStar);	// 18
		
		// 숫자를 문자열로 형 변환
		// Integer.toString(숫자)
		String strCountStar = Integer.toString(intCountStar);	// 18을 "18"로
		String strCountStar2 = intCountStar + "";	// 보통 숫자를 문자열로 바꿀때 많이 사용
		strCountStar = strCountStar +1;	// "18"+1
		strCountStar2 = strCountStar2 +1;
		System.out.println(strCountStar);
		System.out.println(strCountStar2);
		
		// 문제1
		String example = "2784";
		System.out.println("\"2784\" 문자열에서 각각의 숫자를 뽑아 합을 구하시오.");
		// 위의 example을 이용해서 2+7+8+4 =21
		String ex1 = example.substring(0,1);
		String ex2 = example.substring(1,2);
		String ex3 = example.substring(2,3);
		String ex4 = example.substring(3,4);
		int Ex1 = Integer.parseInt(ex1);
		int Ex2 = Integer.parseInt(ex2);
		int Ex3 = Integer.parseInt(ex3);
		int Ex4 = Integer.parseInt(ex4);
		int ExAll = Ex1 + Ex2 + Ex3 + Ex4;
		System.out.println("결과는 = " + ExAll);
		
		
		String example2 = "4562";
		System.out.println("\"4562\" 문자열에서 숫자를 뽑아 각각의 합을 구하시오.");
		// 4+5+6+2 = 17
		String exa1 = example2.substring(0,1);
		String exa2 = example2.substring(1,2);
		String exa3 = example2.substring(2,3);
		String exa4 = example2.substring(3,4);
		int Exa1 = Integer.parseInt(exa1);
		int Exa2 = Integer.parseInt(exa2);
		int Exa3 = Integer.parseInt(exa3);
		int Exa4 = Integer.parseInt(exa4);
		int ExaAll = Exa1 + Exa2 + Exa3 + Exa4;
		System.out.println("결과는 = " +ExaAll);
//		
		
	}

}
