package calculator;

import calculator.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

public class Calculator {

    Evaluator ev = new Evaluator();

    public double calculate(String formula) {
        CharStream charStream = new ANTLRInputStream(formula);
        GrammarLexer lexer = new GrammarLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);

        ParseTree tree = parser.main();
        return ev.visit(tree);
    }

    public void printResult(String formula) {
        System.out.println("Result: "+new BigDecimal(calculate(formula)).stripTrailingZeros().toPlainString());
    }

}
