package submit02.library;


import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		Library library = Library.getInstence();
		
		Book book1 = new Book(1, "삼국지", false);
		Book book2 = new Book(2, "해리포터와 비밀의 방", false);
		Book book3 = new Book(3, "해리포터와 마법사의 돌", false);
		Book book4 = new Book(4, "해리포터와 아즈카반의 죄수", false);
		Book book5 = new Book(5, "해리포터와 불사조 기사단", false);
		Book book6 = new Book(6, "해리포터와 혼혈왕자", false);
		Book book7 = new Book(7, "해리포터와 죽음의 성물", false);
		Book book8 = new Book(8, "어린왕자", false);
		Book book9 = new Book(9, "나의 라임 오렌지 나무", false);
		Book book10 = new Book(10, "자바의 정석", false);
		Book book11 = new Book(11, "좋은 생각", false);
		Book book12 = new Book(12, "반지의 제왕: 반지 원정대", false);
		Book book13 = new Book(13, "반지의 제왕: 두개의 탑", false);
		Book book14 = new Book(14, "반지의 제왕: 왕의 귀환", false);
		
		library.bookList.add(book1);
		library.bookList.add(book2);
		library.bookList.add(book3);
		library.bookList.add(book4);
		library.bookList.add(book5);
		library.bookList.add(book6);
		library.bookList.add(book7);
		library.bookList.add(book8);
		library.bookList.add(book9);
		library.bookList.add(book10);
		library.bookList.add(book11);
		library.bookList.add(book12);
		library.bookList.add(book13);
		library.bookList.add(book14);
		
		
//		System.out.println(Library.getInstence().bookList.get(2).getBookName().indexOf("해리포터"));
		
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.println(">>> ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				System.out.println("책번호를 입력해 주세요: ");
				int num1 = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < library.bookList.size(); i++) {
					if(num1 == library.bookList.get(i).getBookNum()) {
						library.bookList.get(i).setBookRent(false);
						System.out.println(library.bookList.get(i).getBookName() + "이(가) 입고되었습니다.");
					}
				}	
				
			} else if(num == 2) {
				System.out.println("책 이름을 입력해주세요: ");
				String bookName = sc.nextLine();
				ArrayList<Book> search = searchBook(bookName, library.bookList);
				System.out.println(search);
				
				System.out.println("도서 번호를 입력해주세요: ");
				int bookNumber = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < library.bookList.size(); i++) {
					if(bookNumber == library.bookList.get(i).getBookNum()) {
						library.bookList.get(i).setBookRent(true);
						System.out.println(library.bookList.get(i).getBookName() + "을(를) 대여하셨습니다.");
					}
				}
				
			} else if(num == 3) {
				library.showList();
				
			} else if(num == 4) {
				System.out.println("책 이름을 입력해주세요: ");
				String bookName = sc.nextLine();
				ArrayList<Book> search = searchBook(bookName, library.bookList);
				System.out.println(search);
				
			} else {
				System.out.println("도서관을 방문해주셔서 감사합니다.");
				break;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	} // main 함수
	
	static ArrayList<Book> searchBook(String word, ArrayList<Book> inputList) {
		ArrayList<Book> searchList = new ArrayList<Book>();
				
		for(int i = 0; i < inputList.size(); i++) {
			if(inputList.get(i).getBookName().indexOf(word) != -1) {
				searchList.add(inputList.get(i));
			}
		}
		return searchList;
	}

	
	
}
