package base.decorator;

import base.VisualComponent;

public class BorderDecorator extends Decorator {

	private int width;

	public BorderDecorator(VisualComponent comp, int w) {
		super(comp);
		this.width = w;
	}

	private void drawBorder(int w) {
		System.out.println("draw border.. " + w);
	}

	@Override
	public void draw() {
		this.component.draw();
		drawBorder(width);
	}

}
