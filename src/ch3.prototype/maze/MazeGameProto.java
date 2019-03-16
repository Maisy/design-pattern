package maze;

import maze.mapSite.Direction;
import maze.mapSite.Door;
import maze.mapSite.Maze;
import maze.mapSite.Room;

public class MazeGameProto {

	public Maze createMaze(MazePrototypeFactory mazeFactory) {
		Maze m = mazeFactory.makeMaze();
		Room r1 = mazeFactory.makeRoom(1);
		Room r2 = mazeFactory.makeRoom(2);
		Door theDoor = mazeFactory.makeDoor(r1, r2);

		m.addRoom(r1);
		m.addRoom(r2);

		r1.setSide(Direction.East, theDoor);
		r2.setSide(Direction.West, theDoor);

		return m;
	}

}
