package com.adonis.grokking;

public class LinkedListNavigator {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the linked list
        Node reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }

}
