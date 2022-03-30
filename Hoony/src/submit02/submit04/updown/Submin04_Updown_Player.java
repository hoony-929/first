package submit02.submit04.updown;

// 플레이어 및 베팅
public class Submin04_Updown_Player {
	String name;
	int money;
	int bet = 0;
	
	
	public Submin04_Updown_Player() {
		
	}


	public Submin04_Updown_Player(String name, int money) {

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
	
	
}
