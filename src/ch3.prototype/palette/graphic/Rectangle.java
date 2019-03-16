package palette.graphic;

import palette.Position;

public class Rectangle implements Graphic {

	@Override
	public void draw(Position pos) {
		System.out.println("Draw Rectangle at" + pos);
	}

	@Override
	public Graphic clone() {
		return new Rectangle();
	}
}
