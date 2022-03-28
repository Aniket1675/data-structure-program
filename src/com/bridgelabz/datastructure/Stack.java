package com.bridgelabz.datastructure;

public class Stack<T> {
    // LIFO
    LinkedList list = new LinkedList();

    // Push : Adding elements
    public void push(T data) {
        list.addFirst((T) data);
    }

    // Pop : Deleting elements
    public void pop() {
        list.deleteFirst();
    }

    // TO display
    public void showElements() {
        list.printList();
    }
}
