package submit04;

import java.util.ArrayList;
import java.util.Scanner;

import submit04.dao.BoardDao;
import submit04.model.BoardVO;
import submit04.model.MemberVO;
import submit04.service.BoardService;

public class Submit04BoardMain {

	public static void main(String[] args) {
		BoardService service = BoardService.getInstance();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("넥스트 게시판에 오신것을 환영합니다.");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			System.out.println(">>> ");

			int select = 0;
			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력하시오");
				continue;
			}

			if (select == 1) {
				// 로그인
				System.out.println("아이디를 입력해 주세요.");
				System.out.println(">>> ");
				String id = sc.nextLine();

				System.out.println("비밀번호를 입력해 주세요.");
				System.out.println(">>> ");
				String pw = sc.nextLine();

				MemberVO mem = service.getMem(id);

				if (mem.getMemPw().equals(pw)) {
					System.out.println("로그인 되었습니다.");

					while (true) {
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.println(">>> ");

						select = 0;

						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.out.println("숫자만 입력하시오");
							continue;
						}

						if (select == 1) {
							// 게시글 등록
							System.out.println("글 제목을 입력해주세요: ");
							String title = sc.nextLine();
							System.out.println("글 내용을 입력해주세요: ");
							String contents = sc.nextLine();
							
							String author = service.getMem(id).getMemId();
							service.registBoard(author, title, contents);
							ArrayList<BoardVO> memBdList = service.boardList();
							
							for(int i = 0; i < memBdList.size(); i++) {
								System.out.println(memBdList.get(i));
							}
							System.out.println("글 작성 완료");

									}else if (select == 2) {
										System.out.println("글 번호를 입력해주세요");
										int no = Integer.parseInt(sc.nextLine());

										service.listBaord(no);
										
										ArrayList<BoardVO> boardList1 = service.boardList();
										
									} else if (select == 3) {
										System.out.println("로그아웃 합니다.");
										break;
									}
								}
							}
						}else if (select == 2) {
							System.out.println("아이디를 입력해 주세요.");
							System.out.println(">>> ");
							String id = sc.nextLine();

							System.out.println("이름를 입력해 주세요.");
							System.out.println(">>> ");
							String name = sc.nextLine();

							System.out.println("비밀번호를 입력해 주세요.");
							System.out.println(">>> ");
							String pw = sc.nextLine();

							MemberVO mem = service.getMem(id);

							if (mem.getMemId() != null) {
								System.out.println("중복된 아이디입니다.");
							} else {
								int resultCnt = service.registMem(id, name, pw);
								if (resultCnt > 0) {
									System.out.println("회원가입이 완료되었습니다.");
								} else {
									System.out.println("회원가입 중 오류가 발생했습니다.");
								}
							}
						} else if (select == 3) {
							System.out.println("종료합니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}

			
		}

		
		
		
	}// main 괄호

}
