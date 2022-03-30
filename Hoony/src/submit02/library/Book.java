package submit02.library;

public class Book {
	int bookNum;
	String bookName;
	boolean bookRent;
	
	
	
	
	public Book(int bookNum, String bookName, boolean bookRent) {
		Library library = Library.getInstence();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookRent = bookRent;
				
	}
	
	

	
	@Override
	public String toString() {
		return "[책 번호= " + bookNum + ", 책 제목= " + bookName + ", 대여상태= " + ttoString(bookRent) + "]";
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isBookRent() {
		return bookRent;
	}

	public void setBookRent(boolean bookRent) {
		this.bookRent = bookRent;
	}
	
	public static String ttoString(boolean status) {
		if(!status) {
			return "입고중";
		}
		return "대여중";
	}
	
	
	
}
