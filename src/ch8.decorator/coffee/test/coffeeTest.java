package coffee.test;

import org.junit.Test;

import coffee.abst.Beverage;
import coffee.concrete.Base;
import coffee.concrete.Espresso;
import coffee.concrete.Milk;

public class coffeeTest {

	@Test
	public void test() {
		Beverage beverage = new Base();

		System.out.println(beverage.getTotalPrice());
		beverage = new Espresso(beverage);
		System.out.println(beverage.getTotalPrice());
		beverage = new Espresso(beverage);
		System.out.println(beverage.getTotalPrice());
		beverage = new Milk(beverage);

		System.out.println(beverage.getTotalPrice());
	}

}
