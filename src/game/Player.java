package game;

public class Player {
  private int teamNum;
  private char tokenColor;
  private int winCount = 0;
  
  Player(int num, char color) {
    this.teamNum = num;
    this.tokenColor = color;
  }
  
  public void setColor(char color) {
  	this.tokenColor = color;
  }
  
  public char getTokenColor() {
  	return tokenColor; 
  }
  
  public void setNum(int num) {
    this.teamNum = num;
  }
  
  public int getTeamNum() {
    return teamNum;
  }
  
  public void setWinCount(int num) {
    this.winCount = num;
  }
  
  public void incrementWinCount() {
    this.winCount = winCount + 1;
  }
  
  public int getWinCount() {
    return winCount;
  }
}