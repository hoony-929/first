package homework0321.board;

public class CartoonBoard extends Board{

	private String image;
	
	public CartoonBoard(String title, String boardDay, String image) {
		super(title, boardDay);
		this.image = image;
	}

	@Override
	public String toString() {
		return "CartoonBoard [image=" + image + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
