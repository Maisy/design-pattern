package maze;

import maze.mapSite.BombedWall;
import maze.mapSite.Door;
import maze.mapSite.Room;
import maze.mapSite.RoomWithABomb;
import maze.mapSite.Wall;

public class BombedMazeGame extends MazeGame {

	public BombedMazeGame() {
	}

	@Override
	public Wall makeWall() {
		return new BombedWall();
	}

	@Override
	public Room makeRoom(int n) {
		return new RoomWithABomb(n);
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}

}