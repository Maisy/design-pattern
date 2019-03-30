package regularexp;

public class AndExp implements RegularExp {

	private RegularExp andExp1;
	private RegularExp andExp2;

	public AndExp(RegularExp andExp1, RegularExp andExp2) {
		super();
		this.andExp1 = andExp1;
		this.andExp2 = andExp2;
	}

	@Override
	public boolean match(String context) {
		return andExp1.match(context) && andExp2.match(context);
	}

}
