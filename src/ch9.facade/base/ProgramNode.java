package base;

abstract public class ProgramNode {

	public void getSourcePosition(int line, int index) {
		// �����׷���� ����
	}

	// �ڽ� ����
	public void add(ProgramNode node) {
	}

	public void remove(ProgramNode node) {
	}

	public abstract void traverse(CodeGenerator cg);

}
