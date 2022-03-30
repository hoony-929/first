package class06_method;

import java.util.Scanner;

public class MethodQuestion {

	public static void main(String[] args) {
		// 명함 만들기
		// 사용자가 이름, 연락처, 이메일을 입력했을 때, 콘솔에
		// ===============================================
		// 이름 : [사용자가 입력한 이름]
		// 연락처 : [사용자가 입력한 연락처]
		// 이메일 : [사용자가 입력한 이메일]
		// ===============================================

		makeCard("박재훈", "010-9703-1493", "jhjh5875@naver.com");

		System.out.println("\n=======================================\n");

		// 성적표 만들기
		// 두근두근 성적표가 나왔다!
		// 국어, 영어, 수학 점수를 입력했을 경우,
		// 국어, 영어, 수학, 총점, 평균, 등급을 출력하는 성적표
		// 평균은 소수 둘째자리에서 반올림하여 첫째자리까지 출력
		// 등급은 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F

		// 국어:
		// 영어:
		// 수학:
		// 총점:
		// 평균:
		// 등급:

		grade(71, 64, 82);

//		System.out.println("\n===========================\n");
//		int a = 10;
//		double b = 3.21;
//		double anything = a / b;
//		System.out.println(anything); // int와 int로 나누면 int 값이 나온다.

		System.out.println("\n=======================================================\n");

		// LoopFor에서 했던 각 자리수 더하기를 함수화해보세요.
		System.out.println(eachAdd("2839845"));
		System.out.println(eachAdd(2839845));
		System.out.println(eachAdd("54698746241234154"));

		System.out.println("\n=======================================================\n");

		// 10진수 수를 2진수로 출력하시오
//		System.out.println("10진수를 입력하시오.");
//		Scanner sc = new Scanner(System.in);
//		String inputNum = sc.nextLine();
//		
//		String tenNum = "";
//		int a = Integer.parseInt(inputNum);
//		
//		while(true) {
//			int b = a%2;
//			a = a/2;
//			tenNum += Integer.toString(b) + ",";
//					
//		if(a == 1) {
//			tenNum += Integer.toString(a);
//			break;
//		}
//		}
//		String[] tmp_num = tenNum.split(","); //구분자(,)를 이용하여 배열 변수에 순차적으로 저장한다.
//
//		tenNum = "";
//
//		for(int i=tmp_num.length-1; i>=0; i--) //순서를 뒤집어 준다.
//		{
//			tenNum += tmp_num[i];
//	}
//		System.out.println(tenNum);

		int intVal = 30;
		String binaryString = Integer.toBinaryString(intVal);
		System.out.println(binaryString);

		String myBinaryStr = makeBinary(intVal);
		System.out.println(myBinaryStr);

		System.out.println("\n==============================================================\n");

		// for문 트리..
		// 트리 만드는 것을 함수화 하여 사용자가 층(int n)을 입력 받아 n층 짜리 트리를 출력할 수 있는 메소드를 만들어서 실행

		starTree(15);

	} // main 괄호

	public static void starTree(int n) {
		String star = "*";
		String blank = " ";
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				star += "**";
			}
			blank = "";
			for (int j = 0; j < n - i; j++) {
				blank += " ";
			}
			System.out.println(blank + star + " : " + (i + 1) + "층");
		}

	}


	// 10진수를 2진수
	public static String makeBinary(int num) {
		// 30 입력
		// 30을 2로 나누서 나머지는 0 / 몫은 15
		// 15를 2로 나눠서 나머지는 1 / 몫은 7
		// 7을 2로 나눠서 나머지는 1 / 몫은 3
		// 3을 2로 나눠서 나머지는 1 / 몫은 1

		String result = "";

		while (true) {

			result += (num % 2);

			if (num == 1) {
				break;
			}
			num /= 2;
		}
		return reverseString(result);
	}

	// 결과를 거꾸로 저
	public static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length(); i > 0; i--) {
			reverse += str.substring(i - 1, i);

		}
		return reverse;
	}

	// 메소드 오버로딩 해서, int도 받고, String도 받아야 한다.
	public static int eachAdd(String strNum) {
		int result = 0;
		for (int i = 0; i < strNum.length(); i++) {
			result += Integer.parseInt(strNum.substring(i, i + 1));
		}
		System.out.print("입력한 " + strNum + "의 각 자리수를 더한 결과는 = ");
		return result;
	}

	public static int eachAdd(int strNum) {
		String intNum = Integer.toString(strNum);
		int result = 0;
		for (int i = 0; i < intNum.length(); i++) {
			result += Integer.parseInt(intNum.substring(i, i + 1));
		}
		System.out.print("입력한 " + strNum + "의 각 자리수를 더한 결과는 = ");
		return result;
	}

	public static void makeCard(String inputName, String inputPhone, String inputEmail) {
		System.out.println("====================================");
		System.out.println("이름   : [" + inputName + "]");
		System.out.println("연락처 : [" + inputPhone + "]");
		System.out.println("이메일 : [" + inputEmail + "]");
		System.out.println("====================================");
	}

	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * 
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n      반올림 하고 싶은 자리
	 * @return 반올림 된 실수
	 */
	public static double round(double douNum, int n) {
		// 소수 둘째 자리에서 반올림 해서 소수 첫번째 자리를 만들자 (n = 1)
		// 3.1415926 에서 10을 곱한 뒤, Math.round를 적용하고 다시 10으로 나누면 됨

		// 소수 셋째 자리에서 반올림 해서 소수 두번째 자리를 만들자 (n =2)
		// 3.1415926 에서 100을 곱한 뒤, Math.round를 적용하고 다시 100으로 나누면 됨.... 10의 n승

		// douNum = 3.1415926, n = 2
		int one = 1;
		for (int i = 0; i < n; i++) {
			one *= 10;
		}
		// mul = 314.15926
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double) longNum / one;
		return douVal;
	}

	// int a = 국어, int b = 영어, int c = 수학
	public static void grade(int a, int b, int c) {
		System.out.println("국어: " + a);
		System.out.println("영어: " + b);
		System.out.println("수학: " + c);
		int sumGrade = a + b + c;
		System.out.println("총점: " + sumGrade);
		double avgGrade = sumGrade / 3.0;
		double avgGrade2 = round(avgGrade, 1);
		System.out.println("평균: " + avgGrade2);
		String grade = "F";
		if (avgGrade2 >= 90) {
			grade = "A";
		} else if (avgGrade2 >= 80) {
			grade = "B";
		} else if (avgGrade2 >= 70) {
			grade = "C";
		} else if (avgGrade2 >= 60) {
			grade = "D";
		}
		System.out.println("등급: " + grade);

	}
}
