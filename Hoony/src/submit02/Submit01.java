package submit02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Submit01 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();

		// 01. 10 ~ 20 사이의 수 출
		for(int i = 0; i < 9; i++) {
			numList.add((int) (Math.random() * 9) + 11);
		}

		System.out.println(numList);
		
		// 02. 중복값 제거
		HashSet<Integer> resultList = new HashSet<Integer>(numList);
		numList = new ArrayList<Integer>(resultList);
		System.out.println(resultList);
		
		// 03. 정수형 리스트 오름차순 정렬
		
		
		ArrayList<Integer> rightList = new ArrayList<Integer>(resultList);
		Collections.sort(rightList);
		System.out.println(rightList);
		
		// 04. 역순 정렬
		Collections.reverse(rightList);
		System.out.println(rightList);	
		
	}
}
