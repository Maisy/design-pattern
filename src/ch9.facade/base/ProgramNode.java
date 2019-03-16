package base;

abstract public class ProgramNode {

	public void getSourcePosition(int line, int index) {
		// 프러그램노드 조작
	}

	// 자식 조작
	public void add(ProgramNode node) {
	}

	public void remove(ProgramNode node) {
	}

	public abstract void traverse(CodeGenerator cg);

}
