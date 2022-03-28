package com.bridgelabz.datastructure;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linkedlist Program");
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

        System.out.println("Welcome to Stacks Program");


        Stack stack = new Stack();
        stack.push("10");
        stack.push("20");
        stack.push("30");
        stack.push("40");
        stack.showElements();

        stack.pop();
        stack.showElements();
        stack.pop();
        stack.showElements();
        stack.pop();
        stack.showElements();
        System.out.println("----------------");


    }
}
