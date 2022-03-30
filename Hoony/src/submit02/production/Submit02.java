package submit02.production;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Submit02 {
	public static void main(String[] args) {
		ArrayList<Submit02_Product> prodList = new ArrayList<Submit02_Product>();
		
		// 02 리스트 등록
		prodList.add(new Submit02_Product("냉장고", 2000000));
		prodList.add(new Submit02_Product("TV", 1000000));
		prodList.add(new Submit02_Product("에어컨", 800000));
		prodList.add(new Submit02_Product("컴퓨터", 1300000));
		prodList.add(new Submit02_Product("선풍기", 100000));
		
		// 03. 가격 내림차순 정렬
		for(int i = 0; i < prodList.size(); i++) {
			for(int j = 0; j < prodList.size() - 1 - i; j++) {
				if(prodList.get(j).getPrice() > prodList.get(j + 1).getPrice()) {
					Submit02_Product temp = prodList.get(j);
					prodList.set(j, prodList.get(j + 1));
					prodList.set(j + 1, temp);
				}
			}
		}
		for(Submit02_Product price : prodList) {
			System.out.println(price);
		}
		
		// 04. 정렬 후 TV 인덱스
						
		for(int i = 0; i < prodList.size(); i++) {
			
			
			if(prodList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		
	} // main 함수

}

