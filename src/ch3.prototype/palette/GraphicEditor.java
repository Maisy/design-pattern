package palette;

import palette.graphic.Graphic;
import palette.graphic.GraphicComposite;

public class GraphicEditor {
	public static void main(String[] args) {

		int selected = 1;
		Position mouse = new Position(1, 3);
		Palette p = new Palette();
		p.getSelected(selected).draw(mouse);

		mouse = new Position(10, 4);
		Graphic comp = new GraphicComposite();
		p.registerNewGraphic(comp);
		selected = 3;
		p.getSelected(selected).draw(mouse);

	}

}
