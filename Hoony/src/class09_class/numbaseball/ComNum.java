package class09_class.numbaseball;

// 컴퓨터 랜덤 3개 숫자
public class ComNum {
	int[] randNum = new int[3];
	
	// 랜덤 3개 값 넣기
	public ComNum() {
		for(int i = 0; i < randNum.length; i++) {
			randNum[i] = (int)(Math.random() * 9);
			
					
			// 다른자리에 값이 중복 될 때
			for(int j = 0; j < i; j++) {
				if(randNum[i] == randNum[j]) {
					i--;
				}
			}
			// 첫째자리가 0일때 다시 값 넣기
			if(randNum[0] == 0) {
				i--;
			}
		}
	}
	
	// 랜덤값 리턴
	int[] getNum(){
		return randNum;
	}
	
}
