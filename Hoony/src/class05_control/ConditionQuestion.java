package class05_control;
import java.util.Scanner;
public class ConditionQuestion {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력하세요: ");
//		String name = sc.nextLine();
//		System.out.print("연락처를 \"-\"없이 입력하세요: ");
//		String phone = sc.nextLine();
//		System.out.print("나이를 입력하세요: ");
//		String age = sc.nextLine();
//		
//		if((name.length() > 0) && (phone.length() == 11 || phone.length() == 10)
//				&& (Integer.parseInt(age) >= 14)) {
//			System.out.println("회원가입 버튼 활성화");
//		}else {
//			System.out.println("회원가입 불가");
//		}
		
		// 사용자로부터 국어, 영어, 수학 점수를 각각
		// 입력 받아서 평균 점수를 구하고 등급을 출력해주세요
		// 평균점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 나머지는 D
		
		// 사용자로부터 입력받은 점수들
		// 점수들을 int로 변환하여 세 과목을 더하고 나누기 3
		// 이후에 if문을 사용해서 등급을 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요: ");
		double korScore = scanner.nextDouble();
		System.out.println("영어 점수를 입력하세요: ");
		double engScore = scanner.nextDouble();
		System.out.println("수학 점수를 입력하세요: ");
		double matScore = scanner.nextDouble();
		
		double aveScore = (korScore + engScore + matScore)/3;
		System.out.println("세 과목의 평균은: "+ aveScore +"이며");
		
		int result = (int) Math.round(aveScore);
		System.out.println("반올림 한 값: "+result);
		
		if(result>=90) {
			System.out.println("등급은 A입니다.");
		} else if(result>=80) {
			System.out.println("등급은 B입니다.");
		} else if(result>70) {
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("등급은 D입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
