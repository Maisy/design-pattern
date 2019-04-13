package gamelevel;

public class Player {

	GameLevel player = GameLevel0.createInstance();

	public void upgradeLevel(GameLevel level) {
		player = level;
	}

	public void simpleAttack() {
		player.simpleAttack();
	}

	public void turnAttack() {
		player.turnAttack();
	}

	public void flyingAttack() {
		player.flyingAttack();
	}

}
