package homework0321.board;


public class Board {
	private int boardNum;
	private String title;
	String boardDay;
	private String boardWrite;

	public Board(String title, String boardWrite) {
		super();
		BoardDB boardDB = BoardDB.getInstance();
		this.boardNum = boardDB.sizeBoard();
		this.title = title;
		this.boardWrite = boardWrite;

	}
	

	
	

	@Override
	public String toString() {
		return "[" + boardNum + ". | " + title + " | " + BoardDB.getInstance().nowDay() + "]";
	}



	public int getBoardNum() {
		return boardNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBoardDay(String boardDay) {
		this.boardDay = boardDay;
	}

	public String getBoardWrite() {
		return boardWrite;
	}

	public void setBoardWrite(String boardWrite) {
		this.boardWrite = boardWrite;
	}

}
