package dk.via.data;

public class Number implements Element {
    private int value;

    public Number(String v) {
        try {
            value = Integer.parseInt(v);
        }
        catch (Exception e) {
            value = 0;
        }
    }

    @Override
    public boolean isOperator() {
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
