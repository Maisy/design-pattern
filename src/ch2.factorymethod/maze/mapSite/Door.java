package maze.mapSite;

public class Door implements MapSite {
	Room room1, room2;

	public Door() {
	}

	public Door(Door d) {
		super();
		this.room1 = d.room1;
		this.room2 = d.room2;
	}

	public Door(Room r1, Room r2) {
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}

	public void initialize(Room a, Room b) {
		this.room1 = a;
		this.room2 = b;
	}

	@Override
	public Door clone() {
		return new Door(this);
	}

}
