package class11_java_api;

import java.util.Calendar;

public class ApiCalendar {
	private int year;
	private int month;
	
	
	public ApiCalendar(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public void drawCal() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int currentDay = 1;
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
//				System.out.print(currentDay + "\t");
				System.out.printf("%2d\t", currentDay);
				currentDay++;
				
				if(currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "ApiCalendar [year=" + year + ", month=" + month + "]";
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
}
