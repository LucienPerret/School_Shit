package ch.zhaw.ads;

import java.util.LinkedList;

public class ListStack implements Stack {
    private LinkedList<Object> stack;

    public ListStack() {
        stack = new LinkedList<Object>();
    }

    @Override
    public void push(Object x) throws StackOverflowError {
        stack.addFirst(x);
    }

    @Override
    public Object pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public Object peek() {
        return stack.peek();
    }

    @Override
    public void removeAll() {
        stack.removeAll(stack);
    }

    @Override
    public boolean isFull() {
        return false;
    }

}
