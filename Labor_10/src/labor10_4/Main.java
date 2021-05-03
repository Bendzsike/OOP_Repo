package labor10_4;

public class Main {
    //    public static void main(String[] args) {
//        String expression1 = "1 2 + 3 2 + *";
//        try {
//            System.out.println("Evaluate(" + expression1 + "): " + IExpression.evaluate(expression1));
//        } catch (ExpressionException e) {
//            System.out.println("Wrong expression: " + expression1);
//            System.out.println(e.getMessage());
//        }
//    }
    public static void main(String[] args) {
        String expressions[] = {"1 2 + 3 2 + * ", "1 2 + +", "1 a +", "1 2,3 *", "1 3 /"};


        for (String expr : expressions) {
            try {
                System.out.println("Eval(" + expr + "): " + IExpression.evaluate(expr));
            } catch (ExpressionException e) {
                System.out.println("Wrong expression: " + expr);
                System.out.println("\t" + e.getMessage());
            }
        }
    }
}
