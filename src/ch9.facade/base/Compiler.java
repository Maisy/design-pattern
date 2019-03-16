package base;

import java.io.BufferedWriter;
import java.io.InputStream;

public class Compiler {

	public void compile(InputStream is, BufferedWriter bw) {
		PScanner sc = new PScanner(is);
		ProgramNodeBuilder builder = new ProgramNodeBuilder();
		Parser parser = new Parser();

		parser.parse(sc, builder);

		CodeGenerator generator = new CodeGenerator(bw);
		ProgramNode parseTree = builder.getRootNode();
		parseTree.traverse(generator);

	}
}
