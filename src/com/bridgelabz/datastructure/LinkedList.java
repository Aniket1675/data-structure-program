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
}
