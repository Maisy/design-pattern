package maze;

import maze.mapSite.Door;
import maze.mapSite.Maze;
import maze.mapSite.Room;
import maze.mapSite.Wall;

public class MazePrototypeFactory extends MazeFactory {
	private Maze _propMaze;
	private Room _propRoom;
	private Wall _propWall;
	private Door _propDoor;

	public MazePrototypeFactory(Maze maze, Room room, Wall wall, Door door) {
		super();
		this._propMaze = maze;
		this._propRoom = room;
		this._propWall = wall;
		this._propDoor = door;
	}

	public Wall makeWall() {
		return _propWall.clone();
	}

	public Door makeDoor(Room a, Room b) {
		Door d = _propDoor.clone();
		d.initialize(a, b);
		return d;
	}

	public Maze makeMaze() {
		return _propMaze.clone();
	}

	public Room makeRoom(int i) {
		Room r = _propRoom.clone();
		r.initialize(i);
		return r;
	}
}
