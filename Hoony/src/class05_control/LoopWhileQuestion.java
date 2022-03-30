package class05_control;

public class LoopWhileQuestion {

	public static void main(String[] args) {
		// while문이랑 for문이랑 표현만 좀 다르고 결국 같은 반복문
		// 크리스마스 트리를 while문으로 출력
		String star = "*";
		String blank = "";
		int i =0;

//		while(i <= 9) {
//			star += "**";
//			
//			System.out.println(star);
//			i++;
//		} while (j <= 9) {
//			blank += " ";
//			System.out.println(blank);
//			j++;
//		}
		while(i < 5) {
			if(i>0) {
				star += "**";
			} 
			blank = "";
;			int j =1;
			while(j<5-i) {
				blank += " ";
				j++;
			}
			System.out.println(i + ": " + blank + star);
			i++;
		}

	
	
	}
}
