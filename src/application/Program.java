package application;

import chess.ChessMatch;
import chess.UI;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
		
		
	}

}
