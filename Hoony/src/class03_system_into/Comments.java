package class03_system_into;

public class Comments {

		// 단일 주석
//		int intVal =1;	// 단일 주석 단축키는 Ctrl + / 입니다.
//		int intVar =2;
		
		/* 다중 주석
		 * 이 안에 
		 * 다중으로 글귀를
		 * 적어도 모두
		 *주석처리
		 */
		
		// 자바 문서(javadoc) 주석(white 테마에서는 색깔이 다름)
		/**
		 *  
		 *  가장 맛있는 과일은
		 */
		static String orange = "오렌지";
		
		public static void main(String[] args) {
			String banana = "바나나";
			//TODO 바나나를 콘솔에 출력해야 함
			
			System.out.println(orange);
		}
		//TODO 주석 = 이따가 뭐 해야지 메모장 기능
}
