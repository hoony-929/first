package submit.submit0107;

public class Submit07_1 {

	public static void main(String[] args) {
		

	}
	public static String textMoney(long money) {
		String result = "";
		
		if(money >= 100000000) {
			long front = money / 100000000;
			result += front + "억 ";
			money %= 100000000;
		}
		
		if(money >= 10000000) {
			long front = money / 10000000;
			result += front + "천 ";
			money %= 10000000;
		}
		
		if(money >= 1000000) {
			long front = money / 1000000;
			result += front + "백 ";
			money %= 1000000;
		}
		
		if(money >= 100000) {
			long front = money / 100000;
			result += front + "십 ";
			money %= 100000;
		}
		
		long front = money / 10000;
		result += front + "만원";
		
		return result;
	}
}
