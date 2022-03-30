package homework0321.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDB {
	
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	// 글쓰기
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	// 시퀀스 제공
	public int sizeBoard() {
		return boardList.size() + 1;
	}
	
	// 게시글 목록 조회
	public void showList() {

		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).toString());
		}

	}
	
	// 날짜 지정
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	
	public String nowDay() {
		String strToday = sdf.format(date);
		return strToday;
	}
	

	
	
}
