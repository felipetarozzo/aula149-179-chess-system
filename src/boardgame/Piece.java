package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//n�o precisa desta linha, por padr�o o java ja iniciaria como null
	}

	protected Board getBoard() {
		return board;
	}	
	
}
