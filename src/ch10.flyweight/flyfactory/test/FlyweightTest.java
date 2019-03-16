package flyfactory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import flyfactory.Flyweight;
import flyfactory.FlyweightFactory;

public class FlyweightTest {

	@Test
	public void test() {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight flyweight = factory.getFlyweight("A");
		flyweight = factory.getFlyweight("A");
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
	}

}
