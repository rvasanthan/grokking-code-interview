package com.adonis.grokking.leet;

public class LinkedlistCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        LinkedlistCycle cycleDetector = new LinkedlistCycle();
        boolean hasCycle = cycleDetector.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }

    public boolean hasCycle(ListNode head) {
        int fast = 0;
        int slow = 0;
        while(head.next != null) {
            head = head.next;
            i++;
        }
    }

    
}
