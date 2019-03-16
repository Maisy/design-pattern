package coffee.concrete;

import coffee.abst.AbstAdding;
import coffee.abst.Beverage;

public class Milk extends AbstAdding {

	public Milk(Beverage material) {
		super(material);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}

}
