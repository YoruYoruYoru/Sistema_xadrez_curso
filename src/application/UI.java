package application;

import chess.ChessPiece;

public class UI {

	
	
	public static void printBoard(ChessPiece[][] chessPiece) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<chessPiece.length; i++) {
			System.out.print(8 - i + " ");
			for (int j = 0; j<chessPiece.length; j++) {
				printPiece(chessPiece[i][j]);
			}
			
		}
	}
	
	public static void printPiece(ChessPiece chessPiece) {
		if (chessPiece == null) {
			System.out.print("-");
		} else {
			System.out.print(chessPiece);
		}
		System.out.print(" ");
	}
	
}
