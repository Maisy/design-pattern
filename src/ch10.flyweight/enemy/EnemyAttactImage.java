package enemy;

public class EnemyAttactImage implements EnemyImage {

	static EnemyImage inst;

	public static EnemyImage createInstance() {
		if (inst == null) {
			inst = new EnemyAttactImage();
			System.out.println("create EnemyAttactImage");
		}

		return inst;
	}

	public void display(int x, int y) {
		System.out.println("display attack image at (" + x + " ," + y + ")");
	}
}
