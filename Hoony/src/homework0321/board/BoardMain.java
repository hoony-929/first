package homework0321.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		BoardDB boardDB = BoardDB.getInstance();

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("행동을 선택해 주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.println(">>> ");
			int inputNum = Integer.parseInt(sc.nextLine());

			if (inputNum == 3) {
				System.out.println("종료합니다.");
				break;
			} else if (inputNum == 2) {
				System.out.println("글 제목을 입력해 주세요: ");
				String inputTitle = sc.nextLine();
				System.out.println("글 내용을 입력해주세요: ");
				String inputWrite = sc.nextLine();

				boardDB.addBoard(new Board(inputTitle, inputWrite));

			} else if (inputNum == 1) {
				BoardDB.getInstance().showList();

			} else {
				System.out.println("잘못 입력하셨습니다.");

			}
		}

	} // main 괄호

}
