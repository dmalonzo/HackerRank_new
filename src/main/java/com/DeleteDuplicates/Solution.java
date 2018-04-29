package main.java.com.DeleteDuplicates;

public class Solution {

    /*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if (head == null)
        {
            return null;
        }

        Node nextn = head.next;

        while ( nextn != null && head.data == nextn.data)
        {
            nextn = nextn.next;
        }

        head.next = RemoveDuplicates(nextn);
        return head;

    }

}
