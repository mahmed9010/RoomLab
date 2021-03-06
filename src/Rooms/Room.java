package Rooms;

import People.Person;

public class Room {
	Person occupant;
	int xLoc,yLoc,zLoc;
	
	public Room(int x, int y, int z)
	{
		xLoc = x;
		yLoc = y;
		zLoc = z;
	}

	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You have entered the Labrinth. To exit you must defeat the dragon on the last floor.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		x.setzLoc(this.zLoc);
	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
