package maze.test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import maze.MazeGameProto;
import maze.MazePrototypeFactory;
import maze.mapSite.Door;
import maze.mapSite.Maze;
import maze.mapSite.Room;
import maze.mapSite.Wall;

public class MazeTest {

	@Test
	public void testCreateMaze() {
		MazeGameProto game = new MazeGameProto();
		MazePrototypeFactory mazeFactory = new MazePrototypeFactory(new Maze(), new Room(1), new Wall(), new Door());
		assertThat(game.createMaze(mazeFactory), instanceOf(Maze.class));
	}

}
