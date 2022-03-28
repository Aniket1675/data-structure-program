package com.bridgelabz.datastructure;

public class Queue <T> {
    // FIFO
    static LinkedList list = new LinkedList();

    // Adding elements: Enqueue
    public void enqueue(T data) {
        list.addLast(data);
    }

    // Deleting elements: Dequeue
    public void dequeue() {
        list.deleteFirst();
    }

    // to display
    public void showElements() {
        list.printList();

    }
}