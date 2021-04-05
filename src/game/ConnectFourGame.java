package game;

import java.util.Scanner;

public class ConnectFourGame {

	public static void main(String[] args) {
		Player p1 = new Player(1, 'R');
		Player p2 = new Player(2, 'Y');
		Scanner ui = new Scanner(System.in);
    
	    while (true) {
	      int column;
	    System.out.println("Which column do you want to place your piece?");
	      column = ui.nextInt();
	      p1.placeToken(column);
	    }
	    
		 // .......
		 // .......
		 // .......
		 // .......
		 // .R.....
		 // RBBBB..
	
		 // grid[4][0] = 'B';
	
		 //for (int i=0; i<boardHeight; i++) {
		 //  if (grid[i][col].equals('R') || grid[i][0].equals('B')) {
		     
		 //  }
		   
		   
		   
		 // for (int j=0; j<boardWidth; j++) {
		   
		 // }
	    
	}

}