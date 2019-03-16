package maze.mapSite;

public class Room implements MapSite {
	int roomNum;

	public Room(int roomNum) {
		super();
		this.roomNum = roomNum;
		this.setSide(Direction.North, new Wall());
		this.setSide(Direction.East, new Wall());
		this.setSide(Direction.South, new Wall());
		this.setSide(Direction.West, new Wall());
	}

	public Room(Room room) {
		roomNum = room.roomNum;
	}

	public void initialize(int rn) {
		this.roomNum = rn;
	}

	public MapSite getSide(Direction d) {
		return this;
	}

	public void setSide(Direction d, MapSite m) {

	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}

	@Override
	public Room clone() {
		return new Room(this);
	}

}
