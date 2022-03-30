package class07_array;

public class Lotto2 {

	public static void main(String[] args) {
		int[] myLotto = new int[6];
		int idx = 0;
		while(true) {
			int lottNum = (int)((Math.random()*45)+1);
			
			boolean isEqual = false;
			
			// 중복 체크
			for(int i = 0; i < myLotto.length; i++) {
				if(myLotto[i] == lottNum) {
					isEqual = true;
				}
			}
			
			if(isEqual == false) {
				myLotto[idx] = lottNum;
				idx++;
				
				if(idx > 5) {
					break;
				}
			}
			
			
		}  ArrayStudy.printArray(myLotto);
		
		
		for(int i = 0; i < myLotto.length; i++) {
			  boolean swapped = false;
			  
				for(int j = 0; j < myLotto.length - 1 - i; j++) {
					if(myLotto[j] > myLotto[j+1]) {
						myLotto[j] = myLotto[j] + myLotto[j+1];
						myLotto[j+1] = myLotto[j] - myLotto[j+1];
						myLotto[j] = myLotto[j] - myLotto[j+1];
						swapped = true;
					} 
				}
				if(!swapped) {
					break;
				}
				
				
			}
		  	ArrayStudy.printArray(myLotto);
	}

}
