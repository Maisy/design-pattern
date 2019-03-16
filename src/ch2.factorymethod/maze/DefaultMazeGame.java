package maze;

import maze.mapSite.Door;
import maze.mapSite.Room;
import maze.mapSite.Wall;

public class DefaultMazeGame extends MazeGame {

	public DefaultMazeGame() {
	}

	@Override
	public Room makeRoom(int n) {
		return new Room(n);
	}

	@Override
	public Wall makeWall() {
		return new Wall();
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}

}