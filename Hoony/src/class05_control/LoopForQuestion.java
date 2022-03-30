package class05_control;

public class LoopForQuestion {

	public static void main(String[] args) {
		// 거꾸로 트리를 5층 만들어 주세요
		
				String star = "*****";
		for(int i=5; i>=1; i--) {
			 String subStar = star.substring(0,i);
			 System.out.println(subStar);
			
			}
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		// 거꾸로 2단 출력
		for(int i = 9; i >= 2; i--) {
			System.out.println("2 x "+ i +" = "+ (2*i));
		}
		
		// 월리를 찾아라
		String Wally = "윌리울리일리울리울리일리월리";
		int countWal = 0;
		for(int i = 0; i < Wally.length()-1; i++) { // .length()'-1' 
			// i = 0부터 13가지 증가한다.
			String strWal = Wally.substring(i, i + 2); 
			// error Message: String index out of range
			// substirng 함수 사용시 잘라낸 변수의 길이가 벗어난 경
			if(strWal.equals("월리")) {
				countWal++ ;
			}
		} System.out.println("월리의 갯수는: " + countWal);
		
		System.out.println("\n============================================================\n");
		
		// 크리스마스가 지났지만 5층 크리스마스 트리
		//        *
		//       ***
		//      *****
		//     *******
		//    *********
		
		star = "*";
		String blank = " ";
		for(int i =0; i<5; i++) {
			if(i>0) {
				star += "**";
			}
			blank="";
			for(int j =1; j<5-i; j++) {
				blank += " ";
			}
			System.out.println(i + ": "+ blank + star);
		}
		
		System.out.println("\n============================================================\n");
		// 거꾸로 트리
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		// blank는 0, 1, 2, 3, 4개
		// star는 9, 7, 5, 3, 1개
	
		for(int i =5; i > 0; i--) {
			for(int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			} for(int k = i*2-1; k > 0; k--) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		blank = "";
		for(int i = 0; i < 5; i++) {
			if(i > 0 ) {
				blank += " ";
			} 
			star = "*";
			for(int j = 0; j < 4-i; j++) {
				star += "**";
			} System.out.println(i+ ": " + blank + star);
		}
		
		// while문
		
		
		
	}
}
