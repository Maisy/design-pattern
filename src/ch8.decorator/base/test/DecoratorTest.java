package base.test;

import org.junit.Test;

import base.TextView;
import base.Window;
import base.decorator.BorderDecorator;
import base.decorator.ScrollDecorator;

public class DecoratorTest {

	@Test
	public void test() {
		Window window = new Window();
		TextView textview = new TextView();

		// window.setContents(textview);
		window.setContents(new BorderDecorator(new ScrollDecorator(textview), 10));

		window.getContents().stream().forEach(comp -> comp.draw());
	}

}
