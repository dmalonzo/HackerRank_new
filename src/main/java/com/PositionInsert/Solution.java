package main.java.com.PositionInsert;

public class Solution {

    /*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        Node newn = new Node();
        Node start = new Node();
        newn.data = data;

        if ( head == null)
        {
            head = newn;
            newn.next = null;
            start = head;
        }else
        {
            Node prev = new Node();
            prev = head;

            if (position == 0)
            {
                start = newn;
                newn.next = head;
            }else
            {
                start = head;
                for(int i=0; i<position; i++)
                {
                    prev = head;
                    head = head.next;
                }

                prev.next = newn;
                newn.next = head;

            }


        }
        return start;
    }
}
