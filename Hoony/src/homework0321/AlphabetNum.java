package homework0321;

public class AlphabetNum {

	public static void main(String[] args) {
		
		String example = "a3b2c4d1a2h4";
		

		
		int count = 0;
		
		int num = 0;
		
		char c = 0;
		
		
		for(int i = 0; i < example.length(); i++) {
			if(i % 2 != 0) {
				num = Integer.parseInt(Character.toString(example.charAt(i)));
			}else if(i % 2 == 0) {
				c = example.charAt(i);
			}
			count++;
			
			if(count == 2) {
				for(int j = 0; j < num; j++) {
					System.out.print(c);
				}
				count = 0;
			}			
		}

		
		
		
	}

}
