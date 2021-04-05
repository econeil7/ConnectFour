package game;

public class Player {
	private int teamNum;
  private char tokenColor;
  
  Player(int num, char color) {
    this.teamNum = num;
    this.tokenColor = color;
  }
  
  public void placeToken(int col) {
    
  }
  
  public void setColor(char color) {
  	this.tokenColor = color;
  }
  
  public char getColor() {
  	return tokenColor; 
  }
  
  public void setNum(int num) {
    this.teamNum = num;
  }
  
  public int getTeamNum() {
    return teamNum;
  }
}