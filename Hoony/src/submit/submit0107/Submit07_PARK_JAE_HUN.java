package submit.submit0107;

public class Submit07_PARK_JAE_HUN {

	public static void main(String[] args) {
		

		System.out.println(textMoney(12345));
		System.out.println(textMoney(93456));
		System.out.println(textMoney(123489));
		System.out.println(textMoney(1244389));
		System.out.println(textMoney(12434489));
		System.out.println(textMoney(124345489));
		
		
		
		
		
	} // main 함수
	public static String textMoney(long moneyVal) {

		String inputMoney = String.valueOf(moneyVal);
		String[] arrayUnit = {"만", "십", "백", "천", "억"};
		String result = "";
		for(int i = 0; i < inputMoney.length() - 3; i++) {
			if(i == 1) {
				String strMoney = inputMoney.substring(0,1);
				result = strMoney + arrayUnit[0];
			} else if(i == 2) {
				String strMoney = inputMoney.substring(0,1);
				String strMoney1 = inputMoney.substring(1,2);
				result = strMoney + arrayUnit[1] + strMoney1 + arrayUnit[0];
			} else if(i == 3) {
				String strMoney = inputMoney.substring(0,1);
				String strMoney1 = inputMoney.substring(1,2);
				String strMoney2 = inputMoney.substring(2,3);
				result = strMoney + arrayUnit[2] + strMoney1 + arrayUnit[1] + strMoney2 + arrayUnit[0];
			} else if(i == 4) {
				String strMoney = inputMoney.substring(0,1);
				String strMoney1 = inputMoney.substring(1,2);
				String strMoney2 = inputMoney.substring(2,3);
				String strMoney3 = inputMoney.substring(3,4);
				result = strMoney + arrayUnit[3] + strMoney1 + arrayUnit[2] + strMoney2 + arrayUnit[1]
						+ strMoney3 + arrayUnit[0];
			} else if(i == 5) {
				String strMoney = inputMoney.substring(0,1);
				String strMoney1 = inputMoney.substring(1,2);
				String strMoney2 = inputMoney.substring(2,3);
				String strMoney3 = inputMoney.substring(3,4);
				String strMoney4 = inputMoney.substring(4,5);
				result = strMoney + arrayUnit[4] + strMoney1 + arrayUnit[3] + strMoney2 + arrayUnit[2]
						+ strMoney3 + arrayUnit[1] + strMoney4 + arrayUnit[0];
			} 
		}
		return result;
	}
	
	
	
	
	
	
	
}
