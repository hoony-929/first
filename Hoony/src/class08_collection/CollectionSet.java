package class08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합(HashSet)의 선언
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> stuSet2 = new HashSet<String>();
		Set<String> stuSet3 = new HashSet<String>();
		
		// .add() 데이터 추가
		stuSet.add("욱근");
		stuSet.add("주석");
		stuSet.add("예반");
		
		System.out.println(stuSet);
		
		stuSet.add("욱근");
		//// 중복 값 add 안됨
		System.out.println(stuSet); 
		
		// .contains() 해당 데이터가 Set 안에 있으면 true, 없으면 false
		System.out.println(stuSet.contains("주석"));
		System.out.println(stuSet.contains("재훈"));
		
		// .size() Set내 데이터의 개수를 리턴
		
		System.out.println(stuSet.size());
		
		System.out.println("\n=========================================================\n");
		// Set 조회
		// while문 사용
		Iterator<String> iterator = stuSet.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		// 데이터를 100개 정도 받았다고 했을 때
		for(int i = 0; i < 100; i++) {
			stuSet.add(i + "");
		}
		System.out.println("for문을 쓴느 이유");
		// 향상된 for문 = foreach문
		
		for(String name : stuSet) {
			System.out.println(name);
		}
		
		// .foreach 사용
		stuSet.forEach(name -> System.out.println(name));
		stuSet.forEach(name -> {
			System.out.println(name);
			System.out.println(name);
		});
		
		System.out.println("\n=============================================================\n");
		
		// Set은 집합을 쓰는 경우가 아니라면 잘 쓰지 않으며, 그나마 쓴다면 중복을 하지 않는 속성을 이용하는 경우
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			intList.add(i);
		}
		for(int i = 4; i < 10; i++) {
			intList.add(i);
		}
		System.out.println(intList);
		
		// ArrayList에서 HashSet으로 변환
		HashSet<Integer> tempSet = new HashSet<Integer>();
		tempSet.addAll(intList);
		System.out.println(tempSet);
		
		// HashSet에서 ArrayList로 변환
		intList.clear();
		intList = new ArrayList<Integer>(); // intList.clear() 와 같음
		intList.addAll(tempSet);
		System.out.println(intList);
		
		
		
	} // main

}
