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
	private int ROW_COUNT = 6;
	private int COL_COUNT = 7;
	private int maxMoves = ROW_COUNT * COL_COUNT;
	private int movesMade = 0;
	private char[][] board = new char[ROW_COUNT][COL_COUNT];
	
	public void populateBoard() {
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = 'o';
            }
        }
	}
  
	public void displayBoard() {
		System.out.println("1 2 3 4 5 6 7");
		for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
		System.out.println("-------------------------------------");
	}
	
	public boolean placeToken(int chosenCol, Player p) {
		chosenCol = chosenCol - 1; // changing user selected column to 0 base
		boolean gameDraw = false;
		boolean gameWin = false;
		boolean emptyCol = true;
		int x;
		boolean notFull = checkForFullColumn(chosenCol);
		if(notFull) 
		{
			for (int row = 0; row < board.length; row++) {
				if (board[row][chosenCol] != 'o') {
					board[row-1][chosenCol] = p.getTokenColor();
					emptyCol = false;
					x = row-1;
					break;
				}
			}
			if (emptyCol) {
				board[5][chosenCol] = p.getTokenColor();
				x = 5;
			}
			displayBoard();
			movesMade++;
			
			gameWin = checkForWin(x, chosenCol, p);
			if (gameWin)
			{
				clearBoard();
				System.out.println("Player " + p.getTeamNum() + " wins!");
			}
			else
			{
				gameDraw = checkMaxMoves();
				if (gameDraw)
				{
					clearBoard();
					displayBoard();
				}
			}
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
	
	public boolean checkMaxMoves()
	{
		if (movesMade >= maxMoves)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public boolean checkForWin(int x, int y, Player p) {
		if (checkHorizontalWin(x, y, p) || checkVerticalWin(x, y, p) || checkDiagonalWin(x, y, p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkHorizontalWin(int x, int y, Player p) 
	{
		// check Y of [x][y]
		return false;
	}
	
	public boolean checkVerticalWin(int x, int y, Player p) 
	{
		// check X of [x][y]
		return false;
	}
	
	public boolean checkDiagonalWin(int x, int y, Player p) 
	{
		// check [x-1][y+1] and [x+1][y-1] for / OR check [x+1][y+1] and [x-1][y-1] for \
		return false;
	}
	  
	public void clearBoard()
    {
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
            	board[row][col] = 'o';
            }
        }
        movesMade = 0;
    }
  
}