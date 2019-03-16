package maze;

import maze.mapSite.Door;
import maze.mapSite.DoorNeedingSpell;
import maze.mapSite.EnchantedRoom;
import maze.mapSite.Room;
import maze.mapSite.Wall;

public class EnchantedMazeGame extends MazeGame {

	public EnchantedMazeGame() {
	}

	@Override
	public Room makeRoom(int n) {
		return new EnchantedRoom(n);
	}

	@Override
	public Wall makeWall() {
		return new Wall();
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}

}