package gamelevel;

import static org.junit.Assert.*;

import org.junit.Test;

public class GemeLevelTest {

	@Test
	public void test() {
		Player user1 = new Player();

		user1.simpleAttack();
		user1.turnAttack();
		user1.flyingAttack();

		System.out.println("----------");

		GameLevel level1 = GameLevel1.createInstance();
		user1.upgradeLevel(level1);

		user1.simpleAttack();
		user1.turnAttack();
		user1.flyingAttack();

		System.out.println("----------");

		GameLevel level2 = GameLevel2.createInstance();
		user1.upgradeLevel(level2);

		user1.simpleAttack();
		user1.turnAttack();
		user1.flyingAttack();

	}

}
