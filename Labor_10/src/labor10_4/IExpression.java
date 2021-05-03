package labor10_4;

public interface IExpression {
    public static double evaluate(String str) throws ExpressionException{
        String[] values = str.split(" ");
        Stack operands = new Stack(3);
        double op1 = 0, op2 = 0;
        for(String value : values) {
            value = value.trim();
            if(!isOperator(value)) {
                try {
                    operands.push(Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    throw new ExpressionException("\tWrong operand: " + value);
                }
                catch (StackException e) {
                    throw new ExpressionException("\tThis should never happen! (Stack is full!)");
                }
            } else {
                try {
                    op1 = operands.top();
                    operands.pop();
                    op2 = operands.top();
                    operands.pop();
                    switch(value) {
                        case "+" -> operands.push(op1 + op2);
                        case "-" -> operands.push(op1 - op2);
                        case "*" -> operands.push(op1 * op2);
                        case "/" -> operands.push(op1 / op2);
                    }
                } catch (StackException e) {
                    throw new ExpressionException("\tWrong postfix expression");
                }
            }
        }
        try {
            return operands.top();
        } catch (StackException e) {
            throw new ExpressionException("\tResult not in stack! (stack might be empty)");
        }
    }

    public static boolean isOperator(String str) {
        return (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"));
    }
}