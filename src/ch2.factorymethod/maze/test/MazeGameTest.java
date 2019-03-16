package maze.test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import maze.BombedMazeGame;
import maze.DefaultMazeGame;
import maze.EnchantedMazeGame;
import maze.MazeGame;
import maze.mapSite.Maze;
import maze.mapSite.Room;
import maze.mapSite.RoomWithABomb;

public class MazeGameTest {

	private MazeGame mazeGame;

	@Test
	public void createDefaultMaze() throws Exception {
		mazeGame = new DefaultMazeGame();
		Maze maze = mazeGame.createMaze();

		assertThat(maze, instanceOf(Maze.class));
		assertThat(maze.getRoom(1), instanceOf(Room.class));
	}

	@Test
	public void createEnchantedMaze() throws Exception {
		mazeGame = new EnchantedMazeGame();
		Maze maze = mazeGame.createMaze();

		assertThat(maze, instanceOf(Maze.class));
		assertThat(maze.getRoom(1), instanceOf(Room.class));
	}

	@Test
	public void createBombedMaze() throws Exception {
		mazeGame = new BombedMazeGame();
		Maze maze = mazeGame.createMaze();

		assertThat(maze, instanceOf(Maze.class));
		assertThat(maze.getRoom(1), instanceOf(RoomWithABomb.class));
	}

}