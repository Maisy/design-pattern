package widget;

public class Button implements Widget {
	private String label;

	public Button(String string) {
		label = string;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("[" + label + "]");
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		System.out.println("[" + label + "] disabled");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("[" + label + "] removed");
	}

}
