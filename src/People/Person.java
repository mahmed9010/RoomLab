package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String playerName;
	int xLoc, yLoc, zLoc;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public int getzLoc(){return zLoc;}

	public void setzLoc(int zLoc){this.zLoc = zLoc;}
	public Person (String playerName, int xLoc, int yLoc, int zLoc)
	{
		this.playerName = playerName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.zLoc = zLoc;
	}


}
