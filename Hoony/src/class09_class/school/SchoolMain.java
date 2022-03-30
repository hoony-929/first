package class09_class.school;

import java.util.ArrayList;
import java.util.Collections;

import class09_class.UtilClass;

/*
 * 실행(main 메소드)만을 담당하는 클래스
 */
public class SchoolMain {
	
	int intVal = 10;
	static String strVal = "스테틱의 단검";
	
	public static void main(String[] args) {
		// 클래스를 객체로 선언
		Student minwoo = new Student();
		
		// 객체 뒤에 점(.) 찍으면 객체가 가지고 있는 변수와 메소드에 접근이 가능하다.
		System.out.println(minwoo.name);
		
		// 객체가 가진 메소드 실행
		minwoo.state();
		
		// 값을 초기화하지 않았다면, 필드 변수들은 초기값들로 설정되어 있다.
		// 기본타입(숫자, boolean), 참조타입
		// 숫자는 0, (실수는 0.0)
		// boolean은 false
		// 참조타입 null
		
		// 객체의 상태(State) 설정
		minwoo.name = "민우";
		minwoo.kor  = 90;
		minwoo.eng  = 80;
		minwoo.math = 75;
		minwoo.avg  = (90 + 80 + 75) / 3.0;
		minwoo.isMan = true;
		
		System.out.println(minwoo.name);
		
		minwoo.state();
		
		// 두번째 객체 선언
		Student bumseok = new Student();
		
		bumseok.name = "법석";
		bumseok.kor  = 80;
		bumseok.eng  = 83;
		bumseok.math = 88;
		bumseok.isMan = true;
		
		bumseok.state();
		
		System.out.println(bumseok.avg);
		
		System.out.println("\n==================================================\n");
		
		// 필드값을 입력 받는 생성자(constructor)로 객체 만들기
		Student yujin = new Student("유진", 90, 93, 30, (90 + 93 + 30) / 3.0, false);
		
		yujin.state();
		
		// 평균을 입력받지 않아도되는 생성자 사용하기
		Student sangwoo = new Student("상우", 80, 70, 91, true);
		
		sangwoo.state();
		
		// static 변수나 메소드는 클래스를 객체로 만들지 않아도 바로 사용 가능
		System.out.println(UtilClass.owner);
		
//		System.out.println(intVal); // 실행 안됨
		SchoolMain scMain = new SchoolMain();
		System.out.println(scMain.intVal);
		
		System.out.println(strVal);
		
		System.out.println("\n=========================================\n");
		
		// 객체 복사(잘못된 예시)
		Student sangwoo2 = sangwoo;
		
		System.out.println(sangwoo);
		System.out.println(sangwoo2);
		System.out.println(sangwoo.hashCode());
		System.out.println(sangwoo2.hashCode());
		
		sangwoo2.avg = 100;
		System.out.println(sangwoo.avg);
		
		// 객체 복사(옳은 예시)
		Student sangwoo3 = new Student(sangwoo.name, sangwoo.kor, sangwoo.eng
				, sangwoo.math, sangwoo.isMan);
		
		sangwoo3.state();
		
		System.out.println("\n================================================================\n");
		
		// syso로 객체 표현하기
		// 클래스 내에서 toString을 @Override 하면 된다.
		
		System.out.println(minwoo);
		
		System.out.println("\n================================================================\n");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(minwoo);
		stuList.add(bumseok);
		stuList.add(yujin);
		stuList.add(sangwoo);
		stuList.add(new Student("용석", 80, 70, 75, true));
		stuList.add(new Student("지혜", 80, 71, 75, false));
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		// stuList 안의 학생들의 평균을 이용해서 종합 성적표를 출력하시오
		// 1등. 상우 국어 80 영어 70 수학 91 평균 100.0
		// 2등. ~~~~~~
		
		// (1) 정렬
		System.out.println(stuList.get(0).name);
		System.out.println(stuList.get(0).avg);
		
		for(int i = 0; i < stuList.size(); i++) {
			for(int j = 0; j < stuList.size() -1 - i; j++) {
				if(stuList.get(j).avg > stuList.get(j + 1).avg) {
					Student temp = stuList.get(j);
					stuList.set(j,  stuList.get(j + 1));
					stuList.set(j + 1, temp);
				}
			}
		}
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		System.out.println("\n=======================================================\n");
		
		for(int i = 0; i < stuList.size(); i++) {
			for(int j = 0; j < stuList.size() -1 - i; j++) {
				if(stuList.get(j).avg < stuList.get(j + 1).avg) {
					Student temp = stuList.get(j);
					stuList.set(j,  stuList.get(j + 1));
					stuList.set(j + 1, temp);
				}
			}
		}
		int idx = 1;
		for(Student stu : stuList) {
			System.out.println(idx + "등. " + "이름: " + stu.name + ", 국어: " + stu.kor + ", 영어: "
					 + stu.eng + ", 수학: " + stu.math + ", 평균: " + stu.avg + ", 남성여부: " + stu.isMan);
			idx++;
		}
		
		System.out.println("\n========================================================\n");
		
		// 정렬
		Collections.sort(stuList);
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		
		
		
	}
}
