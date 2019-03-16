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
		// ��ӹ����ִ� parent type���� �����ϵ��� �ؾ���
		return new BombedWall(this);
	}

}
