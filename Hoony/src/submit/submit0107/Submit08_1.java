package submit.submit0107;

public class Submit08_1 {

	public static void main(String[] args) {
		
		String example = "aaabbcdddaeefffffgg";
		
		String anw = "";
		
		int cnt = 1;
		
//		example += " ";
		
		for (int i = 0; i < example.length() - 1; i++) {
			if (example.charAt(i) == example.charAt(i + 1)) {
				cnt++;
			} else {
				anw += example.charAt(i) + (cnt + "");
				cnt = 1;
			}
			if(i == example.length() - 2) {
				anw += example.charAt(i) + (cnt + "");
			}
		}
		System.out.println(anw);
	}

}
