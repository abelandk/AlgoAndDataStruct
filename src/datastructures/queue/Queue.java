package datastructures.queue;

import java.util.NoSuchElementException;

public class Queue<T> {

    class Q {
        T data;
        Q next;

        public Q(T data) {
            this.data = data;
        }
    }

    Q first;
    Q last;

    public Queue(T data) {
        first = new Q(data);
        last = first;
    }

    public void add(T data) {

        if(first == null) {
           first = new Q(data);
           last = first;
        }
        else {
            Q q = new Q(data);
            last.next = q;
            last = last.next;
        }
    }

    public void remove() {

        if(first == null) throw new NoSuchElementException();
        else {
            first = first.next;
        }
    }

    public T peek() {

        if(first == null) throw new NoSuchElementException();

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
