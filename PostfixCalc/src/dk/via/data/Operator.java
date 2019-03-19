package dk.via.data;

public class Operator implements Element {
    private String symbol;

    public Operator(String s) {
        symbol = s;
    }

    @Override
    public boolean isOperator() {
        return true;
    }

    @Override
    public String toString() {
        return symbol;
    }
}