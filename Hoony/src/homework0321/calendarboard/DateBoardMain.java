package homework0321.calendarboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import class09_class.UtilClass;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 30; i++) {
			int randMonth = (int) (Math.random() * 3) + 1; // 1~3
			int randDay = (int) (Math.random() * 28) + 1; // 1~28
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth - 1, randDay);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}

		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

		System.out.println("\n================================================================\n");

		// 날짜순
		for (int i = 0; i < dbList.size() - 1; i++) {
			for (int j = 0; j < dbList.size() - 1 - i; j++) {

				String dbStr1 = dbList.get(j).getDate();
				String dbStr2 = dbList.get(j + 1).getDate();
				
				Date dbDate1 = sdf.parse(dbStr1);
				Date dbDate2 = sdf.parse(dbStr2);

				long dbLong1 = dbDate1.getTime();
				long dbLong2 = dbDate2.getTime();
				// date 타입으로 변환
				// date 타입을 빼기 => int 타입으로 변환

				if (dbLong1 > dbLong2) {
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j + 1));
					dbList.set(j + 1, temp);
				}

			}
		}
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

		System.out.println("\n===================================================================================\n");

		// 최근 한달 내
		for (int i = 0; i < dbList.size(); i++) {
			String dbStr = dbList.get(i).getDate();
			Date dbDate = sdf.parse(dbStr);
			long dbLong = dbDate.getTime();

			Date date = new Date();
			String strDay = sdf.format(date);
			Date dateToday = sdf.parse(strDay);
			long dateLong = dateToday.getTime();

			long diffMillSec = dateLong - dbLong;

			long diffDay = diffMillSec / (1000 * 60 * 60 * 24);

			if (diffDay <= 30) {
				System.out.println(dbList.get(i));
			}

		}

		System.out.println("\n===================================================================================\n");

		// 이번달에 작성된 게시글만 출력 (월만 출력)
		for (int i = 0; i < dbList.size(); i++) {
			SimpleDateFormat dbSdf = new SimpleDateFormat("MM");
			String dbStr = dbList.get(i).getDate();
			Date bdDate = sdf.parse(dbStr);
			String dbMonth = dbSdf.format(bdDate);

			Date dateToday = new Date();
			String todayMonth = dbSdf.format(dateToday);

			if (dbMonth.equals(todayMonth)) {
				System.out.println(dbList.get(i));
			}

		}

		System.out.println("\n===================================================================================\n");

		// 2월달에 작성된 게시글만 출력
		for (int i = 0; i < dbList.size(); i++) {
			SimpleDateFormat dbSdf = new SimpleDateFormat("MM");
			String dbStr = dbList.get(i).getDate();
			Date bdDate = sdf.parse(dbStr);
			String dbMonth = dbSdf.format(bdDate);

			if (dbMonth.equals("02")) {
				System.out.println(dbList.get(i));
			}

		}

		System.out.println("\n=================================================\n");

		// 2022년 2월 14일부터 2022년 3월 21일까지 작성된 게시글만
		for (int i = 0; i < dbList.size(); i++) {
			SimpleDateFormat dbSdf = new SimpleDateFormat("yyyyMMdd");
			String dbStr = dbList.get(i).getDate();
			Date dbDate = sdf.parse(dbStr);
			String dbDay = dbSdf.format(dbDate);
			int dayDay = Integer.parseInt(dbDay);

			if (dayDay > 20220213 && dayDay < 20220322) {
				System.out.println(dbList.get(i));
			}

		}

	} // main 괄호

}
