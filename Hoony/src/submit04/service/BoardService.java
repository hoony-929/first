package submit04.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import submit04.dao.BoardDao;
import submit04.jdbc.ConnectionPool;
import submit04.model.BoardVO;
import submit04.model.MemberVO;

public class BoardService {
	private static BoardService instance = new BoardService();
	private BoardDao dao = BoardDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();

	public static BoardService getInstance() {
		if (instance == null) {
			instance = new BoardService();
		}

		return instance;
	}

	// 1. 회원 가입
	public int registMem(String id, String name, String pw) {
		
		Connection conn = cp.getConnection();

		try {
			return dao.registMem(conn, id, name, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return 0;
	}

	// 2. 파라미터 id에 대한 board_member 데이터 가져오기
	public MemberVO getMem(String id) {
		Connection conn = cp.getConnection();

		try {
			return dao.getMem(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}
		return new MemberVO();
	}

	// 3. 게시글 등록
	public int registBoard(String author, String title, String contents) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.registBoard(conn, author, title, contents);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 4. 게시글 데이터 가져오기
	public ArrayList<BoardVO> boardList() {
		Connection conn = cp.getConnection();
		
		try {
			return dao.boardList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn!=null)
				cp.releaseConnection(conn);
		}
		return new ArrayList<BoardVO>();
	}
	
	// 게시글 조회
	public void listBaord(int num){
		
		ArrayList <BoardVO> BoardContent = boardList();
		System.out.println("\n============================\n");
		System.out.println("제목 : " + BoardContent.get(num-1).getBoardTitle());
		System.out.println("작성자 : " + BoardContent.get(num-1).getBoardAuthor());
		System.out.println("작성일 : " + BoardContent.get(num-1).getBoardDate());
		System.out.println("글내용 : " + BoardContent.get(num-1).getBoardContents());
		System.out.println("\n============================\n");
	}
	
	
	
	
	
	
	
	
	

	
	
}
