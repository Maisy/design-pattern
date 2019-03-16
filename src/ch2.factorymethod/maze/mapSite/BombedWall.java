package maze.mapSite;

public class BombedWall extends Wall {
	boolean bomb;

	public BombedWall() {
	}

	public BombedWall(BombedWall bombedWall) {
		this.bomb = bombedWall.bomb;
	}

	@Override
	public Wall clone() {
		// 상속받은애는 parent type으로 리턴하도록 해야해
		return new BombedWall(this);
	}

}
