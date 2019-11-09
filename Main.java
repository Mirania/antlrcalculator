package calculator;

public class Main {

    static Calculator c = new Calculator();

    public static void main(String[] args) {
        String f = "1 + (3 * sqrt(6+3))*2 + 6%2 * 25 + 7.25 - (16 + -32(4*5) + 23/16.1) ++ 2^3";
        show(f);
    }

    public static void show(String expr) {
        System.out.println(expr);
        c.printResult(expr);
}
}
