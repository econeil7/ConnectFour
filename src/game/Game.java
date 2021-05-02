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
      String gameState, playAgain;
      boolean invalidInput, fullCol;
      boolean running = true;
      int turn = 1;
      while (running)
      {
    	  if (turn == 0)
    	  {
    		  invalidInput = true;
    		  while (invalidInput)
    		  {
	    		  System.out.print("Play again [y/n]? ");
	    		  playAgain = scanner.next();
	    		  if (playAgain.equals("y"))
	    		  {
	    			  g.displayBoard();
	    			  turn++;
	    			  invalidInput = false;
	    		  }
	    		  else if (playAgain.equals("n"))
	    		  {
	    			  running = false;
	    			  break;
	    		  }
	    		  else
	    		  {
	    			  System.out.println("Sorry, please type either 'y' or 'n'.");
	    		  }
    		  }
    	  }
    	  else if (turn % 2 == 1)
    	  {
	    	  System.out.print("Player 1, please select a column: ");
	    	  col = scanner.nextInt();
	    	  invalidInput = true;
	          while (invalidInput)
	          {
		            if (col >= 1 && col <= 7)
		            {
		            	invalidInput = false;
		          	  	gameState = g.placeToken(col, p1);
		          	  	if (gameState == "win")
		          	  	{
		          	  		g.clearBoard();
		          	  		turn = 0;
		          	  		break;
		          	  	}
		          	  	else if (gameState == "draw")
		          	  	{
		          	  		g.clearBoard();
		          	  		turn = 0;
		          	  		break;
		          	  	}
		          	  	else if (gameState == "full column")
		          	  	{
		          	  		System.out.println("That column is full. Please choose a different one.");
		          	  	}
		          	  	else
		          	  	{
		          	  		turn++;
		          	  	}
		            }
		            else
		            {
		            	System.out.println("Invalid input. Please try again with a number between 1 and 7.");
		            }
	          }
    	  }
    	  else
    	  {
			  System.out.print("Player 2, please select a column: ");
	    	  col = scanner.nextInt();
	    	  invalidInput = true;
	          while (invalidInput)
	          {
	        	  if (col >= 1 && col <= 7)
		            {
		            	invalidInput = false;
		          	  	gameState = g.placeToken(col, p2);
		          	  	if (gameState == "win")
		          	  	{
		          	  		g.clearBoard();
		          	  		turn = 0;
		          	  		break;
		          	  	}
		          	  	else if (gameState == "draw")
		          	  	{
		          	  		g.clearBoard();
		          	  		turn = 0;
		          	  		break;
		          	  	}
		          	  	else if (gameState == "full column")
		          	  	{
		          	  		System.out.println("That column is full. Please choose a different one.");
		          	  	}
		          	  	else
		          	  	{
		          	  		turn++;
		          	  	}
		            }
		            else
		            {
		            	System.out.println("Invalid input. Please try again with a number between 1 and 7.");
		            }
	          }
    	  }
      }
      System.out.println("Thanks for playing!");
  }
}