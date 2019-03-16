package coffee.abst;

abstract public class AbstAdding implements Beverage {
	private Beverage base;

	public AbstAdding(Beverage base) {
		super();
		this.base = base;
	}

	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}

	public Beverage getBase() {
		return base;
	}
}
