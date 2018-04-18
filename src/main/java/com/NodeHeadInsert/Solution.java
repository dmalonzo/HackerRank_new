package main.java.com.NodeHeadInsert;

public class Solution {
    /*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission.
// You only need to complete this method.

    Node Insert(Node head,int x) {
        Node start = new Node();
        Node newn = new Node();
        newn.data = x;

        if (head == null)
        {
            head = newn;
            head.next = null;
            start = head;
        }else{

            newn.next = head;
            start = newn;
        }

        return start;

    }
}
