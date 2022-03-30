package homework0321.board;

public class AudioBoard extends Board{
	private String audio;
	
		public AudioBoard(String title, String boardDay, String audio) {
		super(title, boardDay);
		this.audio = audio;
	}

		@Override
		public String toString() {
			return "AudioBoard [audio=" + audio + "]";
		}

		public String getAudio() {
			return audio;
		}

		public void setAudio(String audio) {
			this.audio = audio;
		}
		
		
		
}
