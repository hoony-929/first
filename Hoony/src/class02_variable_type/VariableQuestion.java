package class02_variable_type;

public class VariableQuestion {

	public static void main(String[] args) {
		String enigma = "너오구늘리뭐너먹구지리";
		
		// 너, 구, 리 를 제거를 해서 출력하기
		// .replace
		
		String strtoday1 = enigma.replace("너","");
		System.out.println("1차 암호 해독[\"너\" 제거]: " +strtoday1);
		String strtoday2 = strtoday1.replace("구","");
		String strtoday3 = strtoday2.replace("리","");
		System.out.println(strtoday3);
		
		// step2. 한줄로 처리해서 출력해보세요.
		enigma = enigma
				.replace("너","")
				.replace("구","")
				.replace("리","");
		System.out.println(enigma);

	}

}
