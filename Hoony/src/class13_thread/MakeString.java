package class13_thread;

public class MakeString {
	public static void main(String[] args) {
		// 문자열을 아주 길게 만들어보자
		String result = "";
//		StringBuffer sbResult = new StringBuffer("");
		StringBuilder sbResult = new StringBuilder("");
		
//		for(int i = 0; i < 1000000; i++) {
////			result += (int)(Math.random() * 10);
//			sbResult.append((int)(Math.random() * 10));
//			
//			if(i % 100000 == 0) {
//				System.out.println(i + "...");
//			}
//		}
		
//		System.out.println(result.length());
//		System.out.println(sbResult.length());
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 5000000; i++) {
				sbResult.append((int)(Math.random() * 10));
				
				if(i % 1000000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(sbResult.length());
		}, "유진");
		
		Thread thread2 = new Thread(() -> {
			for(int i = 0; i < 5000000; i++) {
				sbResult.append((int)(Math.random() * 10));
				
				if(i % 100000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(sbResult.length());
		}, "예반");
		
		thread1.start();
		thread2.start();
		
		
		
		
		
	}
}
