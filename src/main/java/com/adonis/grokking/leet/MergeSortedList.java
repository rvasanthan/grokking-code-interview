package com.adonis.grokking.leet;

public class MergeSortedList {
    public static void main(String[] args) {
        MergeSortedList sortedList = new MergeSortedList();
        int[] array1 = {1,2,4};
        int[] array2 = {1,3,4};
        ListNode node1 = sortedList.convert(array1);
        ListNode node2 = sortedList.convert(array2);
        sortedList.printRecursively(sortedList.mergeList(node1, node2));
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode convert(int[] array1) {
        ListNode node = new ListNode();
        ListNode firstnode = null;
        for(int i=0; i<array1.length; i++) {
            node.val = array1[i];
            if(i != array1.length-1) {
                node.next = new ListNode();
            }
            if(i == 0) {
                firstnode = node;
            }
            node = node.next;
        }
        return firstnode;
    }

    public void printRecursively(ListNode node) {
        System.out.println(node.val);
        if(node.next != null)
            printRecursively(node.next);
    }

    public ListNode mergeList(ListNode list1, ListNode list2) {

        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeList(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeList(list1, list2.next);
            return list2;
        }
    }
}
