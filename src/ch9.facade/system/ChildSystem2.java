package system;

public class ChildSystem2 {

	public ChildSystem2() {
		System.out.println("Call constructor: " + getClass().getSimpleName());
	}

	public void process() {
		System.out.println("process " + getClass().getSimpleName());
	}
}
