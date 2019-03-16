package maze;

import maze.mapSite.Door;
import maze.mapSite.Maze;
import maze.mapSite.Room;
import maze.mapSite.Wall;

public class MazeFactory {

	public MazeFactory() {
	}

	public Maze makeMaze() {
		return new Maze();
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Room makeRoom(int n) {
		return new Room(n);
	}

	public Door makeDoor(Room a, Room b) {
		return new Door(a, b);
	}
}
