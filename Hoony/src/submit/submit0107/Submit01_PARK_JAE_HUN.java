package submit.submit0107;

public class Submit01_PARK_JAE_HUN {

	public static void main(String[] args) {
		// 1. 정수, 실수, 문자열 타입의 변수들을 선언하여 각각 출력하시오.
		int a = 1;
		double b = 3.14;
		String c = "박재훈";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("\n============================\n");
		// 2. 위에서 선언한 변수들의 값을 교체하시오.
		a = 2;
		b = 4.25;
		c = "자바";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("\n============================\n");
		// 3. 위에서 선언한 정수형 타입의 변수를 실수로 형변환하여 출력하시오.
		double d = (double) a;
		System.out.println(d);
		
		System.out.println("\n============================\n");
		// 4. 위에서 선언한 실수형 타입의 변수를 정수로 형변환하여 출력하시오.
		int e = (int) b;
		System.out.println(e);
		
		System.out.println("\n============================\n");
		// 5. 위에서 선언한 정수형 타입의 변수를 문자열로 형변환하여 출력하시오.
		String f = Integer.toString(a);
		System.out.println(f);
		
		System.out.println("\n============================\n");
		// 6. 정수로 이루어진 문자열 타입의 변수를 정수로 형변환하여 출력하시오.
		String g = "12345";
		int h = Integer.parseInt(g);
		System.out.println(h);
		
		System.out.println("\n============================\n");
		// 7. 정수, 실수, 문자열 타입의 상수들을 선언한 후 콘솔창에 각각 출력하시오.
		final int j = 123;
		final double k = 8.258;
		final String l = "개발자";
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
//		j = 321;		// 오류
//		k = 4.1256;	// 오류
//		l = "개발자2";	// 오
//		System.out.println(j); // 오류
//		System.out.println(k); // 오류
//		System.out.println(l); // 오류
		
		
		
		
	}

}
