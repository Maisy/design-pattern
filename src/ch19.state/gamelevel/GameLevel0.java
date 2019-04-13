package gamelevel;

public class GameLevel0 extends GameLevel {
	private static GameLevel0 pInstance;

	public static GameLevel0 createInstance() {
		if (pInstance == null) {
			pInstance = new GameLevel0();
		}
		return pInstance;
	}

	@Override
	public void simpleAttack() {
		System.out.println(getClass().getSimpleName() + " Simple Attack");
	}

	@Override
	public void turnAttack() {
		System.out.println(getClass().getSimpleName() + " Not allowed");
	}

	@Override
	public void flyingAttack() {
		System.out.println(getClass().getSimpleName() + " Not allowed");
	}
}
