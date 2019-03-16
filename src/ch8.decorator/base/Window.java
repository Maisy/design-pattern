package base;

import java.util.ArrayList;

public class Window {

	ArrayList<VisualComponent> list;

	public Window() {
		list = new ArrayList<>();
	}

	public void setContents(VisualComponent contents) {
		list.add(contents);
	}

	public ArrayList<VisualComponent> getContents() {
		return list;
	}
}
