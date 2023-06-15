package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	
	// Constructor
	public King(Board board, Color color) {
		super(board, color);
	}
	
	// Methods
	@Override
	public String toString() {
		return "K";
	}

}
