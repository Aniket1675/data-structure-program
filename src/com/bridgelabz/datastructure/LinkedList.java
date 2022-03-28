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
}
