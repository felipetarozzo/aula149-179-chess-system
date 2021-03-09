package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//não precisa desta linha, por padrão o java ja iniciaria como null
	}

	protected Board getBoard() {
		return board;
	}	
	
}
