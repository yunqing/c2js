import org.antlr.runtime.*;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream input = new ANTLRFileStream(args[0]);
		qsortLexer lex = new qsortLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		// System.out.println("tokens="+tokens);
		qsortParser parser = new qsortParser(tokens);
		parser.program();
	}
}
