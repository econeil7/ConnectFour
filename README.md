# ConnectFour

Vision Statement (Eric O’Neil, Homere Persona, Eric Kasirahinga)

Connect Four is a two-player game where players take turns placing a colored piece from their pile into a grid aiming to beat the other player into getting four of their own pieces in a row. Four pieces are considered in a row if they are horizontally, vertically, or diagonally adjacent in any direction. Pieces are stacked atop one another so a column of the grid can only hold a maximum number of pieces before no more can be added. Strategies to win the game usually involve trying to place four of your own pieces in a row while simultaneously blocking the efforts of your opponent to do the same.

UML Diagram

https://i.imgur.com/MSsqedn.png

User Stories

1.	As a player, I want to choose the column my piece will go into so that I can decide where I will begin connecting my pieces.
2.	As the game, I want to inform which player won so that we can correctly verify once a player has four pieces in a row.
3.	As the game, I want to reset the state of the board so that the players can play again without restarting the program.
4.	As the game, I want to keep track of full columns so that I can prevent players from placing tokens in columns that already contain the maximum number of pieces.
5.	As the game, I want to keep track of players’ turns so that each player can only play one piece before moving on to their opponent.
6.	As the game, I want to keep track of where pieces are placed so that players don’t place pieces in the same positions.
7.	As the game, I want to check the state of the board each turn so that I can inform a player once they have won.
8.	As the game, I want to display the board so that players can strategize where their pieces will go without needing to memorize past actions.
