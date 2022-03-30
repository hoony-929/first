package class07_array;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ArrayStudy {

	public static void main(String[] args) {
		// 배열 (Array)
		String student1 = "박종빈";
		String student2 = "박재훈";
		String student3 = "김중규";
		String student4 = "오창환";

		System.out.println("신흥 2-2: " + student1 + student2 + student3 + student4);

		System.out.println("\n================================ 문자 배열 ==================================\n");
		// 배열의 선언1

		String[] students = new String[4];
		// String 타이브이 변수를 4개 담을 수 있는 students 배열 선언

		// 배열은 .length뒤에 소괄호가 안붙음
		// 배열.length을 하면 해당 배열의 크기를 리턴한다.
		System.out.println("배열 크기: " + students.length);

		// 배열 값 확인, 인덱스 사용
		System.out.println(students[0]);

		// 0부터 array.length 미만까지 순회하면 배열의 모든 요소에 접근이 가능하다
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + ",");
		}

		System.out.println("\n================================ 숫자 배열 ==================================\n");

		int[] intArray = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
		// 숫자형 타입의 경우 값을 주지 않으면 0
		// 참조형 타입의 경우 값을 주지 않으면 null

		System.out.println("\n================================ 배열에 값 넣기 ==================================\n");

		students[0] = "박종빈";
		students[1] = "박재훈";
		students[2] = "김중규";
		students[3] = "오창환";

		System.out.println(students[1] + ", " + students[2]);

		// 배열의 단점
		// 크기가 고정됨;;;
//		students[4] = "도대성";
		// 빨간줄 에러는 컴파일 에러로, 실행을 안해봐도 이클립스가 캐치
		// 빨간줄은 안뜨는데 실행했을 때 발생하는 경우 에러는 런타임 에러
//		System.out.println(studednts[4]);

		printArray(students);

		int intVal = 12;
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = intVal;
			intVal *= 2;
		}

		printArray(intArray);

		System.out.println("\n=====================================================================================\n");
		// 배열의 선언2
		String[] strArray = { "박재훈", "박종빈", "오창환", "김중규" };
		// 박재훈, 박종빈, 오창환, 김중규의 값을 가지는 크기 4의 문자열 배열 선언

//		strArray[4] = "도대성";
		printArray(strArray);

		System.out.println("\n============================== 문자열 나누기 ====================================\n");

		String myInfo = "박재훈, 010-9703-1493, jhjh5875@naver.com";
		// .split() 괄호안 문자열을 기준으로 해당 문자열을 문자열 배열로 나눈다.
		String[] infoArray = myInfo.split(", "); // ',' 를 기준으로
		System.out.println(infoArray.length);
		System.out.println(infoArray[0]);
		System.out.println(infoArray[1]);
		System.out.println(infoArray[2]);
		printArray(infoArray);

		// 제 1 정규화 - 모든 데이터는 각각각각각각각ㄱ각 따로

		String calStr = "1+4+2";
		String[] calArray = calStr.split("\\+");
		printArray(calArray);

		System.out.println("\n============================== 배열의 복사 ====================================\n");

		int intValA = 10;
		int intValB = intValA;

		intValB = 5;
		System.out.println("A: " + intValA);
		System.out.println("B: " + intValB);

		String[] copyArray = strArray;
		printArray(copyArray);
		System.out.println(strArray);
		System.out.println(copyArray);
		System.out.println(strArray.hashCode());
		System.out.println(copyArray.hashCode());

		// 해쉬코드?
		// 객체의 메모리 주소값을 이용하여 해쉬를 적용한 코드
		// 해쉬란?
		// 해쉬함수(암호화 알고리즘)을 이용하여 데이터를 암호화하는 기법

		copyArray[2] = "도대성";
		printArray(strArray);
		printArray(copyArray);

		System.out.println("\n============================ 암호화 / 복호화 ================================\n");
		
		// 암호화, 복호화
		// 암호화
		Encoder base64Encoder = Base64.getEncoder();
		String password = "1q2w3e4r";
		byte[] passByte = password.getBytes();
		String encryption = new String(base64Encoder.encode(passByte)); // encryption = 암호화

		System.out.println("암호화된 비밀번호: " + encryption);
		
		// 복호화
		Decoder base64Decoder = Base64.getDecoder();
		String decryption = new String(base64Decoder.decode(encryption));
		System.out.println("복호화된 비밀번호: " + decryption);
		
		System.out.println("\n====================================================================================\n");
		
		// 올바른 배열 복사
		String[] copyArray2 = strArray.clone();
		printArray(copyArray2);
		
		System.out.println(strArray.hashCode());
		System.out.println(copyArray2.hashCode());
		
		copyArray2[1] = "신민철";
		printArray(strArray);
		printArray(copyArray2);
		
		// clone을 까먹어도 배열은 옮기기가 아주 쉽다.
		
		String[] sameStrArray = new String[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
			sameStrArray[i] = strArray[i];
		}
		printArray(sameStrArray);
		
		System.out.println("\n=============================== 숫자 배열 ======================================\n");
		
		int[] intArr = {23, 456, 21548, 387941, 1, 6, 487 ,521321, 8, 15};
		
		// 자리 바꾸기
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp; 
		printArray(intArr);
		
		System.out.println("\n=============================== 정렬 ========================================\n");
		
		// 정렬 알고리즘
		// 버블 정렬
		for(int i = 0; i < intArr.length; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < intArr.length - 1; j++) {
				if(intArr[j] > intArr[j+1]) {
					temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
					swapped = true;
				} 
			}
			
			if(!swapped) {
				System.out.println("정렬 완료");
				break;
			}
			
			System.out.println(i + "회 시행");
			printArray(intArr);
		}
//		printArray(intArr);
		System.out.println("\n=======================================\n");
		int[][] doubleArr = {{1,2,3},{4,5,6},{7,8,9}};
		int[] tempArr = doubleArr[0];
		printArray(tempArr);
		
		tempArr = doubleArr[1];
		printArray(tempArr);
		
		tempArr = doubleArr[2];
		printArray(tempArr);
		
		System.out.println(tempArr[0]);
		System.out.println(doubleArr[1][0]);
		System.out.println(doubleArr[2][1]);
		
		int[][][] tripleArr = {{{1,2,3},{4,5,6},{7,8,9}}, {{10,11,12},{13,14,15},{16,17,18}}, {{19,20,21},{22,23,24},{25,26,27}}};
		System.out.println(tripleArr[1][2][0]);

	} // main 괄호
		// 배열 요소 출력 함

	public static void printArray(String[] strArray) {
		for (int i = 0; i < strArray.length; i++) {

			if (i == strArray.length - 1) {
				System.out.println(strArray[i]);
			} else {
				System.out.print(strArray[i] + ", ");
			}
		}
	}

	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {

			if (i == intArray.length - 1) {
				System.out.println(intArray[i]);
			} else {
				System.out.print(intArray[i] + ", ");
			}
		}
	}

}
