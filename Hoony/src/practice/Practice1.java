package practice;

import java.util.Calendar;

public class Practice1 {
	private int year;
	private int month;

	public Practice1(int year, int month) {
		this.year = year;
		this.month = month;
	}


		public void drawCal() {
			Calendar calendar = Calendar.getInstance();

			calendar.set(year, month - 1, 1);

			int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			int startDay = calendar.get(Calendar.DAY_OF_WEEK);

			System.out.println(year + "년 " + month + "월 달력 (주말 제외)");
			System.out.println("월\t화\t수\t목\t금");

			int currentDay = 1;
			for (int i = 0; i < 42; i++) {
				if (i >= startDay) {
					System.out.print(currentDay + "\t");
					if(i % 7 == 1) {
						System.out.print("");
						currentDay++;
					} else if(i % 7 == 0) {
						System.out.print("");
						currentDay++;
					}
					currentDay++;

					if (currentDay > lastDay) {
						break;
					}
				
				}else {
					System.out.print("\t");
				}
				if (i % 5 == 0) {
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


