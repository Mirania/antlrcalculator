package calculator;

import calculator.parser.GrammarBaseVisitor;
import calculator.parser.GrammarParser.*;

public class Evaluator extends GrammarBaseVisitor<Double> {

    @Override
    public Double visitMain(MainContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitLiteralexpr(LiteralexprContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public Double visitSqrtexpr(SqrtexprContext ctx) {
        return Math.sqrt(visit(ctx.parens()));
    }

    @Override
    public Double visitParexpr(ParexprContext ctx) {
        return visit(ctx.parens());
    }

    @Override
    public Double visitPowexpr(PowexprContext ctx) {
        return Math.pow(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public Double visitImplicitexpr(ImplicitexprContext ctx) {
        return visit(ctx.expression()) * visit(ctx.parens());
    }

    @Override
    public Double visitHighexpr(HighexprContext ctx) {
        String op = ctx.getChild(1).getText();
        switch (op) {
            case "*": return visit(ctx.expression(0)) * visit(ctx.expression(1));
            case "/": return visit(ctx.expression(0)) / visit(ctx.expression(1));
            case "%": return visit(ctx.expression(0)) % visit(ctx.expression(1));
            default: throw new IllegalStateException("Highexpr with operator '"+op+"'");
        }
    }

    @Override
    public Double visitLowexpr(LowexprContext ctx) {
        String op = ctx.getChild(1).getText();
        switch (op) {
            case "+": return visit(ctx.expression(0)) + visit(ctx.expression(1));
            case "-": return visit(ctx.expression(0)) - visit(ctx.expression(1));
            default: throw new IllegalStateException("Lowexpr with operator '"+op+"'");
        }
    }

    @Override
    public Double visitParens(ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitLiteral(LiteralContext ctx) {
        double val = Double.parseDouble(ctx.NUMBER().toString());
        return ctx.getChildCount()>1 && ctx.getChild(0).getText().equals("-") ? -val : val;
    }

}
