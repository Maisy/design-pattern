package regularexp;

public class OrExp implements RegularExp {

	private RegularExp orExp1;
	private RegularExp orExp2;

	public OrExp(RegularExp orExp1, RegularExp orExp2) {
		super();
		this.orExp1 = orExp1;
		this.orExp2 = orExp2;
	}

	@Override
	public boolean match(String context) {
		return orExp1.match(context) || orExp2.match(context);
	}

}
