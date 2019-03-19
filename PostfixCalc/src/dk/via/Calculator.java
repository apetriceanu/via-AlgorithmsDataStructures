package dk.via;

import dk.via.data.Operator;
import dk.via.data.Number;
import dk.via.stack.MyStack;

import java.util.StringTokenizer;

public class Calculator {
    private final String ADD = "+";
    private final String SUB = "-";
    private final String MUL = "*";
    private final String DIV = "/";

    private MyStack stack;

    public Calculator() {
        stack = new MyStack();

    }

    public int calculate(String input) {
        int numberOne, numberTwo;
        int result = 0;
        String token;
        StringTokenizer tokenizer = new StringTokenizer(input);

        while(tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();

            if(isOperator(token)) {
                numberTwo = Integer.parseInt(stack.pop().toString());
                numberOne = Integer.parseInt(stack.pop().toString());
                result = singleOperation(token, numberOne, numberTwo);
                stack.push(new Number(String.valueOf(result)));
            } else {
                stack.push(new Operator(token));
            }
        }

        return result;
    }

    private boolean isOperator(String s) {
        return (s.equals(ADD) || s.equals(SUB) || s.equals(MUL) || s.equals(DIV));
    }

    public String getStackContents() {
        return stack.toString();
    }

    private int singleOperation(String operator, int n1, int n2) {
        int result = 0;

        switch(operator) {
            case ADD: result = n1 + n2; break;
            case SUB: result = n1 - n2; break;
            case MUL: result = n1 * n2; break;
            case DIV: result = n1 / n2; break;
        }
        return result;
    }
}