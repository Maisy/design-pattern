package enemy;

public class Enemy {

	int curx, cury;
	EnemyImage curImage;

	public Enemy(int curx, int cury) {
		super();
		this.curx = curx;
		this.cury = cury;
		curImage = EnemyNoActionImage.createInstance();
	}

	public void move(int x, int y) {
		curx = x;
		cury = y;
		curImage = EnemyMoveImage.createInstance();
	}

	public void attact() {
		curImage = EnemyAttactImage.createInstance();
	}

	public void display() {
		curImage.display(curx, cury);
	}

}
