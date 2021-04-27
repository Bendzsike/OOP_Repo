package labor10_4;

public interface IExpression {
    public static double evaluate(String str) throws ExpressionException{
        String[] values = str.split(" ");
        Stack operands = new Stack(3);
        for(int i = 0; i < values.length; ++i) {
            if(!isOperator(values[i].trim())) {
                try {
                    operands.push(values[i].trim());
                } catch(StackException e) {
                    e.getStackTrace();
                }
            } else if(isOperator(values[i].trim())){
                double op1, op2;
                String operandInString = "";
                try {
                    try {
                        operandInString = operands.top().toString();
                    } catch (StackException e) {
                        throw new ExpressionException("Wrong postfix expression\n");
                    }
                    op1 = Double.parseDouble(operandInString);
                    try {
                        operands.pop();
                    } catch (StackException e) {
                        e.getStackTrace();
                    }
                } catch (NumberFormatException e) {
                    throw new ExpressionException("Wrong operand: " + operandInString);
                }
                try {
                    try {
                        operandInString = operands.top().toString();
                    } catch (StackException e) {
                        throw new ExpressionException("Wrong postfix expression\n");
                    }
                    op2 = Double.parseDouble(operandInString);
                    try {
                        operands.pop();
                    } catch (StackException e) {
                        e.getStackTrace();
                    }
                } catch (NumberFormatException e) {
                    throw new ExpressionException("Wrong operand: " + operandInString);
                }

                switch (values[i]) {
                    case "+":
                        try {
                            operands.push(op1 + op2);
                        } catch (StackException e) {
                            throw new ExpressionException("Stack is full!");
                        }
                        break;
                    case "-":
                        try {
                            operands.push(op1 - op2);
                        } catch (StackException e) {
                            throw new ExpressionException("Stack is full!");
                        }
                        break;
                    case "*":
                        try {
                            operands.push(op1 * op2);
                        } catch (StackException e) {
                            throw new ExpressionException("Stack is full!");
                        }
                        break;
                    case "/":
                        try {
                            operands.push(op1 / op2);
                        } catch (StackException e) {
                            throw new ExpressionException("Stack is full!");
                        }
                        break;
                }

            }
        }
        String operandInString;
        try {
            operandInString = operands.top().toString();
        } catch (StackException e) {
            throw new ExpressionException("Wrong postfix expression\n");
        }
        return Double.parseDouble(operandInString);
    }

    public static boolean isOperator(String str) {
        return (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"));
    }
}