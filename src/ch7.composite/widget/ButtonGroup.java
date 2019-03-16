package widget;

import java.util.ArrayList;

public class ButtonGroup implements Widget {
	private ArrayList<Widget> comps;

	ButtonGroup() {
		comps = new ArrayList<>();
		comps.add(new Button("AAA"));
		comps.add(new Button("BBB"));
		comps.add(new Button("CCC"));
	}

	@Override
	public void draw() {
		comps.stream().forEach(comp -> comp.draw());
	}

	@Override
	public void disable() {
		comps.stream().forEach(comp -> comp.disable());
	}

	@Override
	public void remove() {
		comps.stream().forEach(comp -> comp.remove());
	}

}
