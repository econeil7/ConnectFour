package game;

import java.util.Scanner;

public class ConnectFourGame {

	public static void main(String[] args) {
		Player p1 = new Player(1, 'R');
		Player p2 = new Player(2, 'Y');
		Scanner scanner = new Scanner(System.in);
		Grid g = new Grid();
        g.populateBoard();
        g.displayBoard();
        int col;
        boolean proceed = true;
        boolean running = true;
		while (running)
        {
			if (proceed)
			{
	            System.out.print("Player 1, please select a column: ");
	            col = scanner.nextInt();
	            proceed = g.placeToken(col, p1.getTokenColor());
			}
			else
			{
				proceed = true;
			}
			if (proceed)
			{
	            System.out.println("Player 2, please select a column: ");
	            col = scanner.nextInt();
	            proceed = g.placeToken(col, p2.getTokenColor());
			}
			else
			{
				proceed = true;
			}
        }
        g.clearBoard();
        g.populateBoard();
	}

}