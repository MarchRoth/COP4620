// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Hashtable;

public class Driver {
	public static void main(String[] args) throws Exception {

		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);

		// create a lexer that feeds off of input CharStream
		Little lexer = new Little(input);

		//use code below iteratively to get the next token from lexer and print the type and value.
		//Token token = lexer.nextToken();
		
	}
}
