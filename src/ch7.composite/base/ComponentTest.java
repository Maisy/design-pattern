package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComponentTest {

	@Test
	public void test() {
		Composite aComposite = new Composite();
		Leaf aLeaf = new Leaf();

		Component comp;

		comp = aComposite;
		if (comp.getComposite() instanceof Composite) {
			comp.getComposite().add(new Leaf());
		}

		comp = aLeaf;
		if (comp.getComposite() instanceof Composite) {
			comp.getComposite().add(new Leaf()); // unused
		}
	}

}
