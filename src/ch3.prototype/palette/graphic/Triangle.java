package palette.graphic;

import palette.Position;

public class Triangle implements Graphic {

	@Override
	public void draw(Position pos) {
		System.out.println("Draw Triangle at" + pos);
	}

	@Override
	public Graphic clone() {
		return new Triangle();
	}
}
