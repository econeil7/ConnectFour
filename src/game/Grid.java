package game;

public class Grid {
	// 2D array is upside down x,y grid
	// think of X value increasing downwards, Y value increasing to the right
	// Example placing of 'R' in [4][2] position
	//	o o o o o o o 
	//	o o o o o o o 
	//	o o o o o o o 
	//	o o o o o o o 
	//	o o R o o o o 
	//	o o o o o o o 
	private char[][] board = new char[6][7];
	public void populateBoard() {
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = 'o';
            }
        }
	}
  
	public void displayBoard() {
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
		System.out.println("-------------------------------------------------");
	}
	
	public void placeToken(int chosenCol) {
		boolean emptyCol = true;
		for (int row = 0; row < board.length; row++) {
			if (board[row][chosenCol] != 'o') {
				board[row-1][chosenCol] = 'R';
				emptyCol = false;
				break;
			}
		}
		if (emptyCol) {
			board[5][chosenCol] = 'R';
		}
		displayBoard();
	}
	
	public boolean checkForWin() {
	  return true;
	}
	  
	public void resetGrid() {
	  
	}
  
}