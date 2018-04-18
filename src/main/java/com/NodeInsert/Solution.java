package main.java.com.NodeInsert;

public class Solution {

    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    Node Insert(Node head,int data) {
// This is a "method-only" submission.
// You only need to complete this method.
        Node newn = new Node();
        Node start = new Node();
        newn.data = data;
        newn.next = null;

        if (head == null)
        {
            head = newn;
            start = head;
        }else
        {
            start = head;
            while(head.next != null)
            {
                head = head.next;
            }
            head.next = newn;
            head = head.next;
        }

        return start;

    }
}
