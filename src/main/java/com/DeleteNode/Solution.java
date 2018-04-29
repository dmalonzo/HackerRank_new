package main.java.com.DeleteNode;

public class Solution {
    /*
  Delete Node at a given position in a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.

    Node Delete(Node head, int position) {
        // Complete this method

        if (head == null)
        {
            return head;
        }

        if ( position == 0)
        {
            if(head.next != null)
            {
                head = head.next;
            }else
            {
                head = null;
            }

            return head;
        }else
        {
            Node start = head;

            for(int i=0; i < position-1; i++)
            {
                head = head.next;
            }
            head.next = head.next.next;


            return start;
        }

    }
}
