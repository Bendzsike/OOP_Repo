package labor10_4;

public interface IExpression {
    public static double evaluate(String str) throws ExpressionException{
        String[] values = str.split(" ");
        Stack operands = new Stack(3);
        for(int i = 0; i < values.length; ++i) {
            if(!isOperator(values[i].trim())) {
                operands.push(values[i].trim());
            } else if(isOperator(values[i].trim())){
                double op1, op2;
                try {
                    op1 = Double.parseDouble(operands.top().toString());
                    operands.pop();
                } catch (NumberFormatException e) {
                    throw new ExpressionException("Wrong operand: " + operands.top().toString());
                }
                try {
                    op2 = Double.parseDouble(operands.top().toString());
                    operands.pop();
                } catch (NumberFormatException e) {
                    throw new ExpressionException("Wrong operand: " + operands.top().toString());
                }

                switch (values[i]) {
                    case "+" -> operands.push(op1 + op2);
                    case "-" -> operands.push(op1 - op2);
                    case "*" -> operands.push(op1 * op2);
                    case "/" -> operands.push(op1 / op2);
                }
            }
        }
        return Double.parseDouble(operands.top().toString());
    }

    public static boolean isOperator(String str) {
        return (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"));
    }
}
