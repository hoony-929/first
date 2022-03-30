package homework0321;

import java.util.regex.Pattern;

public class AlphaBetNum1_1 {

	public static void main(String[] args) {
		String example = "a3b2c4d1a2h4";
		
		String result = "";
		
		for(int i = 0; i < example.length(); i++) {
			String regex = "[a-zA-Z]";
			String strNum = example.substring(i, i+1);
			boolean reg = Pattern.matches(regex, strNum);
			if(reg == true) {
				String strNum1 = example.substring(i+1, i+2);
				int intNum = Integer.parseInt(strNum1);
				for(int j = 0; j < intNum; j++) {
					result += strNum;
				}
			}
		}
		System.out.println(result);	
		
		
		
		
		
		
		
		
		
		
	}

}
