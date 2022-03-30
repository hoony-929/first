package class09_class.practice.updownbet;

// 플레이어 및 베팅
public class Player {
	String name;
	int money;
	int bet = 0;
	
	
	public Player() {
		
	}


	public Player(String name, int money) {

		this.name = name;
		this.money = money;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", money=" + money + ", bet=" + bet + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getBet() {
		return bet;
	}


	public void setBet(int bet) {
		this.bet = bet;
	}
	
	
//	public int moreMoney(int plusMoney) {
//		this.bet = this.setBet(plusMoney);
//		this.setMoney(this.getMoney() - )
//	}
	
	
	
}
