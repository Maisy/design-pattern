package system;

public class ChildSystem3 {

	public ChildSystem3() {
		System.out.println("Call constructor: " + getClass().getSimpleName());
	}

	public void process() {
		System.out.println("process " + getClass().getSimpleName());
	}
}
