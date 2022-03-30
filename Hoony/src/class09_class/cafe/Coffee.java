package class09_class.cafe;

public class Coffee {
	private String name;	// 커피 이름
	private int price;	 	// 커피 가격
	
	// 클래스 국룰
	// 1. 생성자 만들기 (+ 기본 생성자)
	// 2. toString 만들기
	// 3. getters and setters 만들기
	
	public Coffee(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	
	public Coffee() {
		
	} // 기본 생성자

	@Override
	public String toString() {
		return "Coffee [" + name + ", 가격: " + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

			
}
