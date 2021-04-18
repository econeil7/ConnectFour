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
	int ROW_COUNT = 6;
	int COL_COUNT = 7;
	private char[][] board = new char[ROW_COUNT][COL_COUNT];
	
	public void populateBoard() {
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = 'o';
            }
        }
	}
  
	public void displayBoard() {
		System.out.println("0 1 2 3 4 5 6");
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
		System.out.println("-------------------------------------");
	}
	
	public boolean placeToken(int chosenCol, char color) {
		boolean emptyCol = true;
		boolean notFull = checkForFullColumn(chosenCol);
		if(notFull) 
		{
			for (int row = 0; row < board.length; row++) {
				if (board[row][chosenCol] != 'o') {
					board[row-1][chosenCol] = color;
					emptyCol = false;
					break;
				}
			}
			if (emptyCol) {
				board[5][chosenCol] = color;
			}
			displayBoard();
			return true;
		}
		else
        {
			System.out.println("That column is full!");
			return false;
        }
	}
	
	public boolean checkForFullColumn(int col)
    {
        int row = 0;
        if (col < 0 || col > COL_COUNT){
            return false;
        }

        //full column?
        for(int r = 0; r < ROW_COUNT; r++) {
            if(board[r][col] == 'o') {
                return true;
            }
        }
        return false;
    }
	
	public boolean checkForWin() {
	  return true;
	}
	  
	public void clearBoard()
    {
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
            	board[row][col] = 'o';
            }
        }
    }
  
}