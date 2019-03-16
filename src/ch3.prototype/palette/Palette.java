package palette;

import java.util.HashMap;
import palette.graphic.Graphic;
import palette.graphic.Rectangle;
import palette.graphic.Triangle;

class Palette {

	private HashMap<Integer, Graphic> items;

	Palette() {
		items = new HashMap<>();
		Graphic pGraphic = new Triangle();
		items.put(1, pGraphic);

		pGraphic = new Rectangle();
		items.put(2, pGraphic);

	}

	public void registerNewGraphic(Graphic graphic) {
		items.put(items.size() + 1, graphic);
	}

	public Graphic getSelected(int num) {
		return items.get(num);
	}

}
