package submit04.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	private int boardNum;
	private String boardAuthor;
	private String boardTitle;
	private String boardContents;
	private String boardDate;
	
	public BoardVO() {}
	
	
	
	
//	public BoardVO(String boardAuthor, String boardTitle, String boardContents) {
//		(boardAuthor, boardTitle, boardContents);
//	}
	
	
	public BoardVO(String boardAuthor, String boardTitle, String boardContents) {
		super();

		this.boardAuthor = boardAuthor;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
		Date dateToday = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		this.boardDate = sdf.format(dateToday);;
	}
	

	
	
	
	@Override
	public String toString() {
		return "[" + boardNum  + ". | " + boardTitle
				+ " | " + boardAuthor + " | " + boardDate + "]";
	}
	
	
	
	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	public String getBoardAuthor() {
		return boardAuthor;
	}
	
	public void setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}


	
	
}
