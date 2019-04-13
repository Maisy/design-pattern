package gamelevel;

public abstract class GameLevel {
	protected GameLevel() {

	}

	public static GameLevel createInstance() {
		return null;
	}

	public abstract void simpleAttack();

	public abstract void turnAttack();

	public abstract void flyingAttack();
}
