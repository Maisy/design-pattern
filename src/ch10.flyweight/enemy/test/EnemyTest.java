package enemy.test;

import org.junit.Test;

import enemy.Enemy;

public class EnemyTest {

	@Test
	public void test() {
		Enemy e1 = new Enemy(10, 10);
		Enemy e2 = new Enemy(20, 20);

		e1.move(30, 30);
		e2.attact();
		e2.move(40, 40);

		e1.display();
		e2.display();
	}

}
