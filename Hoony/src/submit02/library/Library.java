package submit02.library;

import java.util.ArrayList;

public class Library {
	
	private static Library instance = new Library();
	
	private Library() {
		
	}
	public static Library getInstence() {
		return instance;
	}
	
	// 북리스트 

	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void showList() {
		for(Book bk : bookList) {
			System.out.println(bk);
		}
	}

	
	
	
}
