package base.decorator;

import base.VisualComponent;

public abstract class Decorator implements VisualComponent {
	VisualComponent component;

	Decorator(VisualComponent comp) {
		this.component = comp;
	}

	@Override
	public abstract void draw();

	@Override
	public void resize() {
		component.resize();
	}

}
