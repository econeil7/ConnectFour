package game;

import java.util.Scanner;

public class ConnectFourGame {

	public static void main(String[] args) {
		Player p1 = new Player(1, 'R');
		Player p2 = new Player(2, 'Y');
		Scanner ui = new Scanner(System.in);
		Grid g = new Grid();
		g.populateBoard();
		g.placeToken(5);
		g.placeToken(5);
		g.placeToken(5);
		g.placeToken(5);
		g.placeToken(5);
		g.placeToken(5);
	}

}