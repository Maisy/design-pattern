package maze.mapSite;

import java.util.ArrayList;

public class Maze implements MapSite {

	private ArrayList<Room> rooms;

	public Maze() {
		rooms = new ArrayList<>();
	}

	public Maze(Maze maze) {
		rooms = new ArrayList<>();
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}

	@Override
	public Maze clone() {
		return new Maze(this);
	}

	public Room getRoom(int num) {
		return rooms.get(num);
	}

	public void addRoom(Room r1) {
		rooms.add(r1);
	}

}
