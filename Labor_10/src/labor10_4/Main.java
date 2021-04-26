package labor10_4;

public class Main {
    public static void main(String[] args) {
        String expression1 = "1,2 2 + 3 2 + *";
        try {
            System.out.println("Eval(" + expression1 + "): " + IExpression.evaluate(expression1));
        } catch (ExpressionException e) {
            System.out.println("Wrong expression: " + expression1);
        }
    }
}
