package com.bridgelabz.datastructure;

public class Main {

    public static void main(String[] args) {
	 LinkedList linkedList = new LinkedList<>();
        linkedList.addFirst(10);
        linkedList.addLast(12);

        linkedList.printList();

        linkedList.addFirst(8);
        linkedList.addFirst(6);
        linkedList.addLast(20);

        linkedList.printList();

        linkedList.deleteFirst();
        linkedList.printList();
        linkedList.deleteLast();
        linkedList.printList();

        linkedList.deleteLast();
        linkedList.printList();


    }
}
