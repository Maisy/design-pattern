package regularexp;

public class LiteralExp implements RegularExp {
	private String literal;

	public LiteralExp(String literal) {
		super();
		this.literal = literal;
	}

	@Override
	public boolean match(String context) {
		return context.contains(literal);
	}

}
