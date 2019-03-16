package widget;

import org.junit.Test;

public class WidgetTest {

	@Test
	public void test() {

		Button singleBtn = new Button("SINGLE");
		singleBtn.draw();
		singleBtn.disable();

		ButtonGroup grpBtn = new ButtonGroup();
		grpBtn.draw();
		grpBtn.disable();

	}

}
