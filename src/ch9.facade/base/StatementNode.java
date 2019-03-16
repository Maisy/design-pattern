package base;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StatementNode extends ProgramNode {

	@Override
	public void traverse(CodeGenerator cg) {
		cg.visit(this);

		ArrayList<ProgramNode> list = new ArrayList<>();
		list.stream().forEach(item -> item.traverse(cg));

	}

}
