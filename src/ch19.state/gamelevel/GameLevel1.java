package gamelevel;

public class GameLevel1 extends GameLevel {
	private static GameLevel1 pInstance;

	public static GameLevel1 createInstance() {
		if (pInstance == null) {
			pInstance = new GameLevel1();
		}
		return pInstance;
	}

	@Override
	public void simpleAttack() {
		System.out.println(getClass().getSimpleName() + " Simple Attack");
	}

	@Override
	public void turnAttack() {
		System.out.println(getClass().getSimpleName() + " Turn Attack");
	}

	@Override
	public void flyingAttack() {
		System.out.println(getClass().getSimpleName() + " Not allowed");
	}
}
