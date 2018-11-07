package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String playerName;
	int xLoc, yLoc, zLoc, attack, defense, health;


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

	public int getAttack(){return attack;}

	public void setAttack(int attack){this.attack = attack;}

	public int getDefense(){return defense;}

	public void setDefense(int defense){this.defense = defense;}

	public int getHealth(){return health;}

	public void setHealth(int health) { this.health = health; }


	public Person (String playerName, int xLoc, int yLoc, int zLoc, int attack, int defense)
	{
		this.playerName = playerName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.zLoc = zLoc;
		this.attack = attack;
		this.defense = defense;
	}


}
