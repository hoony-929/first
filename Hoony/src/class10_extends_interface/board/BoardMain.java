package class10_extends_interface.board;

public class BoardMain {

	public static void main(String[] args) {
		Board board = new Board(1, "첫번재 게시글", "배고파", "jhjh"); // 사용자가 글을 작성했다면 게시글이 새로 하나 생기겠죠
		System.out.println(board.toString());
		
		
		// 중고 거래 게시판이다
		// 필드에 제품 이미지, 제품 가격 등 추가
		
		// 동영상을 올리는 게시판이라고 하면
		// 필드에 동영상 링크 추가
		
		TradeBoard trade = new TradeBoard(1, "갤럭시 S21+ 팝니다. 상태 S급", "판매", "재훈", "s21+.jpg", 600000);
		System.out.println(trade);
		
		VideoBoard video = new VideoBoard(1, "왕돈까스 10장 먹방", "먹방", "히밥", "http://www.youtube.com/hibob/?");
		System.out.println(video);
		
		

	}

}
