package base.decorator;

import base.VisualComponent;

public class ScrollDecorator extends Decorator {

	public ScrollDecorator(VisualComponent comp) {
		super(comp);
	}

	@Override
	public void draw() {
		this.component.draw();
		System.out.println("attach scroll");
	}

}
