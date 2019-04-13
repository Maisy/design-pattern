package gamelevel;

public class GameLevel2 extends GameLevel {
	private static GameLevel2 pInstance;

	public static GameLevel2 createInstance() {
		if (pInstance == null) {
			pInstance = new GameLevel2();
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
		System.out.println(getClass().getSimpleName() + " Flying Attack");
	}
}
