package enemy;

public class EnemyMoveImage implements EnemyImage {

	static EnemyImage inst;

	public static EnemyImage createInstance() {
		if (inst == null) {
			inst = new EnemyMoveImage();
			System.out.println("create EnemyMoveImage");
		}

		return inst;
	}

	public void display(int x, int y) {
		System.out.println("display move image at (" + x + " ," + y + ")");
	}
}
