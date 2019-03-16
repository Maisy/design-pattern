package enemy;

public class EnemyDieImage implements EnemyImage {

	static EnemyImage inst;

	public static EnemyImage createInstance() {
		if (inst == null) {
			inst = new EnemyDieImage();
			System.out.println("create EnemyDieImage");
		}

		return inst;
	}

	public void display(int x, int y) {
		System.out.println("display die image at (" + x + " ," + y + ")");
	}
}
