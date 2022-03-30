package class13_thread;

public class ExRunnable implements Runnable{
	
	int num;
	
	
	 ExRunnable(int num) {
		 this.num = num;
	 }
	
	
	@Override
	public void run() {
		// 현재 실행 중인 Thread의 이름 출력
		System.out.println(Thread.currentThread().getName());
		ThreadMain.printNumbers(num);
		
	}

}
