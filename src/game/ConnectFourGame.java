package game;

import java.util.Scanner;

public class ConnectFourGame {

	public static void main(String[] args) {
		Player p1 = new Player(1, 'R');
		Player p2 = new Player(2, 'Y');
		Scanner scanner = new Scanner(System.in);
		Grid g = new Grid();
		boolean running = true;
        g.populateBoard();
        g.displayBoard();
		while (running)
        {
            int col;
            System.out.print("Player 1, please select a column: ");
            col = scanner.nextInt();
            g.placeToken(col, p1.getTokenColor());
            System.out.println("Player 2, please select a column: ");
            col = scanner.nextInt();
            g.placeToken(col, p2.getTokenColor());
        }
        g.clearBoard();
        g.populateBoard();
	}

}