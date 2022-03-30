package class09_class.school;

import class09_class.UtilClass;

public class Student implements Comparable{
	String name;
	int kor;
	int eng;
	int math;
	double avg;
	boolean isMan;
	
	// 기본 생성자
	// 따로 만들지 않아도 자동으로 존재한다.		
	Student() {
		
	}
	
	// 단축키 [Alt + Shift + S] 혹은 [마우스 우클릭 -> Source]
	// Generate Constructor using Field 클릭 후 Generate 클릭
	public Student(String name, int kor, int eng, int math, double avg, boolean isMan) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.isMan = isMan;
	}
	
	// 메소드 오버로딩과 매우 흡사
	public Student(String name, int kor, int eng, int math, boolean isMan) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		double average = (kor + eng + math) / 3.0;
		this.avg = UtilClass.round(average, 2);
		this.isMan = isMan;
	}
	
	// 성적표 출력
	public void state() {
		System.out.println("=================");
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		avg = UtilClass.round((kor + eng + math) / 3.0, 2);		
		System.out.println("평균: " + avg);
		System.out.println("성별: " + isMan);
		System.out.println("=================");
	}
	
	// 단축키 [Alt + Shift + S] 혹은 [마우스 우클릭 -> Source]
	//
	@Override
	public String toString() {
		return "Student [이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 평균=" + avg
				+ ", 남성여부=" + isMan + "]";
	}

	@Override //비교의 기준을 재정의
	public int compareTo(Object stu) {
//		double compareAvg = ((Student)stu).avg;
		Student temp = ((Student)stu);
		int totalTemp = temp.kor + temp.eng + temp.math;
		
		int totalThis = this.kor + this.eng + this.math;
		
		// 오름차순
//		return (int) (this.avg - compareAvg);
		
		// 내림차순
//		return (int) (compareAvg - this.avg);
		return totalTemp - totalThis;
	}

	
	
}
