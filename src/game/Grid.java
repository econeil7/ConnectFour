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
		System.out.println("0 1 2 3 4 5 6");
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
		System.out.println("-------------------------------------");
	}
	
	public void placeToken(int chosenCol, char color) {
		boolean emptyCol = true;
		boolean result = checkForFullColumn(chosenCol);
		if(result) 
		{ // column not full insert
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
		}
		else //throw error
        {
            try {
                throw new Exception("The column is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
	
	public boolean checkForFullColumn(int col)
    {
        int row = 0;
        System.out.println(col+"");
        if (col < 0 || col > 7){
            return false;
        }

        //full column?
        for(int r = 0; r < 6; r++) {
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