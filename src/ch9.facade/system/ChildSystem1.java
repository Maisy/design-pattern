package system;

public class ChildSystem1 {

	public ChildSystem1() {
		System.out.println("Call constructor: " + getClass().getSimpleName());
	}

	public void process() {
		System.out.println("process " + getClass().getSimpleName());
	}
}
