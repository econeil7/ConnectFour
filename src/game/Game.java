package game;

import java.util.Scanner;

public class Game {
  
  public void runGame() {
	  Player p1 = new Player(1, 'R');
	  Player p2 = new Player(2, 'Y');
	  Scanner scanner = new Scanner(System.in);
	  Grid g = new Grid();
	  System.out.println("   _____                            _     ______               ");
	  System.out.println("  / ____|                          | |   |  ____|              ");
	  System.out.println(" | |     ___  _ __  _ __   ___  ___| |_  | |__ ___  _   _ _ __ ");
	  System.out.println(" | |    / _ \\| '_ \\| '_ \\ / _ \\/ __| __| |  __/ _ \\| | | | '__|");
	  System.out.println(" | |___| (_) | | | | | | |  __/ (__| |_  | | | (_) | |_| | |   ");
	  System.out.println("  \\_____\\___/|_| |_|_| |_|\\___|\\___|\\__| |_|  \\___/ \\____|_|  ");
	  System.out.print("Press any key to continue...");
	  scanner.nextLine();
      g.populateBoard();
      g.displayBoard();
      int col;
      boolean proceed = true;
      boolean running = true;
		while (running)
      {
			if (proceed)
			{
	            boolean invalidInput = false;
	            while (!invalidInput)
	            {
		            System.out.print("Player 1, please select a column: ");
		            col = scanner.nextInt();
		            if (col >= 1 && col <= 7)
		            {
		            	invalidInput = true;
			            proceed = g.placeToken(col, p1);
		            }
		            else
		            {
		            	System.out.println("Invalid input. Please try again with a number between 1 and 7.");
		            }
	            }
			}
			else
			{
				proceed = true;
			}
			if (proceed)
			{
				boolean invalidInput = false;
	            while (!invalidInput)
	            {
		            System.out.print("Player 2, please select a column: ");
		            col = scanner.nextInt();
		            if (col >= 1 && col <= 7)
		            {
		            	invalidInput = true;
			            proceed = g.placeToken(col, p2);
		            }
		            else
		            {
		            	System.out.println("Invalid input. Please try again with a number between 1 and 7.");
		            }
	            }
			}
			else
			{
				proceed = true;
			}
      }
      g.clearBoard();
      g.populateBoard();
  }
  
  public void resetGame() {
    
  }
}