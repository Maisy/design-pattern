package palette.graphic;

import java.util.ArrayList;

import palette.Position;

public class GraphicComposite implements Graphic {

	public GraphicComposite() {
		comp = new ArrayList<>();
		comp.add(new Triangle());
		comp.add(new Rectangle());
	}

	@Override
	public void draw(Position pos) {
		for (Graphic graphic : comp) {
			graphic.draw(pos);
		}
		System.out.println("Draw GraphicComposite at " + pos);
	}

	private ArrayList<Graphic> comp;

	@Override
	public Graphic clone() {
		GraphicComposite graphicComp = new GraphicComposite();
		for (Graphic graphic : comp) {
			graphic.clone();
		}
		return graphicComp;
	}
}
