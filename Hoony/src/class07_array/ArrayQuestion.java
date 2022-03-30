package class07_array;

import java.util.Arrays;

public class ArrayQuestion {

	public static void main(String[] args) {

		int[] intArr = { 23, 456, 21548, 387941, 1, 6, 487, 521321, 8, 15 };

		// intArr의 최댓값을 출력하시오
		// for문 사용
		int maxArr = intArr[0];
		for (int i = 1; i < intArr.length; i++) {

			if (intArr[i] > maxArr) {

				maxArr = intArr[i];

			}

		}
		System.out.println(maxArr);

		// 배열 내 요소 자리 바꾸는 함수
		System.out.println("\n======================================\n");
		// 선택 정렬
		// 1. 해당 배열에서 최댓값을 찾아 해당 위치의 값과 배열의 마지막 값을 swap 한다.
		// 2. 배열의 마지막을 제외한 나머지 값들 중 최댓값을 찾아서 해당 위치의 값과 배열의 끝에서 두번째 값을 swap 한다.
		// 3. 위 과정을 반복하여 정렬하시오.

		// @. 최댓값을 이용해서 내림차순 -> 최댓값을 찾으면 맨 앞으
		int[] intArray = { 3, 5, 2, 7, 1, 4, 6 };
//		int firstIndex;
//		int temp;
//		// 최댓값 내림차순
//		for (int i = 0; i < intArray.length - 1; i++) {
//			boolean swapped = false;
//
//			firstIndex = i;
//			for (int j = i + 1; j < intArray.length; j++) {
//
//				if (intArray[j] > intArray[firstIndex]) {
//					firstIndex = j;
//				}
//			}
//			temp = intArray[firstIndex];
//			intArray[firstIndex] = intArray[i];
//			intArray[i] = temp;
//			swapped = true;
//			if (!swapped) {
//				System.out.println("정렬 완료");
//				break;
//			}
//			System.out.println(i + "회 시행");
//			System.out.println(Arrays.toString(intArray));
//		}
		System.out.println("\n============================================\n");
		// 오름 차순
		for(int i = 0; i < intArray.length - 1; i++) {
			// 최값 구하기
			int maxValue = intArray[0];
			int maxIdx = 0;
			for(int j = 1; j < intArray.length - i; j++) {
				if(maxValue < intArray[j]) {
					maxValue = intArray[j];
					maxIdx = j;
				}
			}
			
			// swap, 최대값인 maxValue의 인덱스와 바꿀자리인 인덱스자리
			swap(intArray, maxIdx, intArray.length-1-i);
			
		}
		ArrayStudy.printArray(intArray); 
		
		// 내림차순
		for(int i = 0; i < intArray.length - 1; i++) {
			int maxVar = intArray[intArray.length - 1];
			int maxIdx = intArray.length - 1;
			for(int j = i; j < intArray.length - 1; j++) {
				if(maxVar < intArray[j]) {
					maxVar = intArray[j];
					maxIdx = j;
				}
			}
			
			swap(intArray, maxIdx, i);
		}
		ArrayStudy.printArray(intArray);
		
	} // main 괄호

	/**
	 * 해당 intArray의 인덱스 indexA와 indexB의 값을 교환한다.
	 * 
	 * @param intArray 값을 교환활 숫자 배열
	 * @param indexA   값을 교환할 인덱스 첫번째
	 * @param indexB   값을 교환할 인덱스 두번째
	 */
	public static void swap(int[] intArray, int indexA, int indexB) {
		int temp = intArray[indexA];
		intArray[indexA] = intArray[indexB];
		intArray[indexB] = temp;

	}

}
