package dk.via;

import dk.via.data.Operator;
import dk.via.data.Number;
import dk.via.stack.MyStack;

public class Calculator {
    private final String ADD = "+";
    private final String SUB = "-";
    private final String MUL = "*";
    private final String DIV = "/";

    private MyStack stack;

    public Calculator() {
        stack = new MyStack();

    }

    public void processInput(String input) {
        String[] elements = input.split("\\s");

        for(String s : elements) {
            if (isOperator(s)) {
                Operator o = new Operator(s);
                stack.push(o);
            } else {
                Number n = new Number(s);
                stack.push(n);
            }
        }


    }

    private boolean isOperator(String s) {
        return (s.equals(ADD) || s.equals(SUB) || s.equals(MUL) || s.equals(DIV));
    }

    public String getStackContents() {
        return stack.toString();
    }

    public int calculate() {
        int numberOne, numberTwo;
        String operator;

        int result = 0;

        while (!(stack.isEmpty())) {
            operator = stack.pop().toString();
            if (isOperator(operator)) {
                numberTwo = Integer.parseInt(stack.pop().toString());
                numberOne = Integer.parseInt(stack.pop().toString());

                result = singleOperation(operator, numberOne, numberTwo);

                stack.push(new Number(String.valueOf(result)));


            } else {
                stack.push(new Number("0"));
                return result;
            }
        }



        return result;

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
