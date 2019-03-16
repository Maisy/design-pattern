package palette.graphic;

import palette.Position;

public interface Graphic {
	public void draw(Position pos);

	public Graphic clone();
}
