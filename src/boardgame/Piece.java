package boardgame;

public class Piece {
	
	// Variables and Attributes
	protected Position position;
	private Board board;
	
	// Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	// Getter and Setters
	protected Board getBoard() {
		return board;
	}
	
	
}
