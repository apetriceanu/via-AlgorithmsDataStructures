package dk.via.stack;

import java.util.ArrayList;

public class MyStack<T> implements StackADT<T> {
    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T element) {
        if (element != null) {
            stack.add(element);
        }

    }

    @Override
    public T pop() {
        T result = null;

        try {
            int lastIndex = stack.size() - 1;
            result = stack.get(lastIndex);

            stack.remove(lastIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            result = null;
        } finally {
            return result;
        }
    }

    @Override
    public T peek() {
        T result = null;

        try {
            int lastIndex = stack.size() - 1;
            result = stack.get(lastIndex);
        } catch (NullPointerException e) {

        } finally {
            return result;
        }
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}