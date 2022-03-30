package class13_thread.issac;

public class IssacMain {
	public static void main(String[] args) {
		Issac issac = new Issac();
		
		Cheif cheif = new Cheif(issac);
		Customer minwoo = new Customer(issac, 2, "민우");
		Customer jaehun = new Customer(issac, 5, "재훈");
		Customer eunji = new Customer(issac, 3, "은지");
		
		cheif.start();
		minwoo.start();
		jaehun.start();
		eunji.start();
		
		
		
		
		
		
		
		
		
	}
}
