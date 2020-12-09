package datastructures.stack;

import java.util.NoSuchElementException;

public class Stack<T> {

    class S
    {
        T data;
        S next;

        public S(T data) {
            this.data = data;
        }
    }

    S top;

    public Stack(T data) {
        top = new S(data);
    }

    public void add(T data) {

        S s = new S(data);
        s.next = top;
        top = s;
    }

    public void pop() {

        if(top == null) throw new NoSuchElementException();
        top = top.next;
    }

    public T peek() {

        if(top == null) throw new NoSuchElementException();
        return top.data;
    }

    public boolean isEmpty() {

        return top == null;
    }
}
