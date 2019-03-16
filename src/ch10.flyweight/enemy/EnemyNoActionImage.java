package enemy;

public class EnemyNoActionImage implements EnemyImage {

	static EnemyImage inst;

	public static EnemyImage createInstance() {
		if (inst == null) {
			inst = new EnemyNoActionImage();
			System.out.println("create EnemyNoActionImage");
		}

		return inst;
	}

	public void display(int x, int y) {
		System.out.println("display no action image at (" + x + " ," + y + ")");

	}
}
