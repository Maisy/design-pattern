package system;

public class Facade {
	private ChildSystem1 child1;
	private ChildSystem2 child2;
	private ChildSystem3 child3;

	public Facade() {
		child1 = new ChildSystem1();
		child2 = new ChildSystem2();
		child3 = new ChildSystem3();
	}

	public void process() {
		child1.process();
		child2.process();
		child3.process();
	}

}
