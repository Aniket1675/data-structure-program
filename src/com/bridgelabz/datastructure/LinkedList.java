package com.bridgelabz.datastructure;

public class LinkedList <T> {
    Node head; //creating the head node
    public int size;


    LinkedList() {
        this.size = 0;  //initializing the size as zero
    }

    //Node class
    public class Node<T> {
        T data;
        Node next;

        //Constructor
        Node(T data) {
            this.data = data;
            this.next = null; //for every new node its next will be null by default
            size++;  //do size++ when creating the new node
        }
    }
    public void addFirst(T data){  //function is addFirst and String data is parameter
        Node newNode = new Node(data);  //creating node
        if (head == null){
            head = newNode; //assign new node value to head
            return;
        }

        newNode.next = head; //new nodes next will point head
        head = newNode; //head value will become new node
    }

    public void addLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) { //travel untill current node's next become null
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data  + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--; //do size-- when deleting the node

        if (head.next == null) {  //case in which linkedlist have only one node
            head = null;
            return;
        }

        Node secondLast = head;    //make second last node's next as null to delete the last
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
}
