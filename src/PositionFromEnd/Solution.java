package PositionFromEnd;

public class Solution {
    /*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    int GetNode(Node head,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        int pos = 0;
        Node curhead = head;
        Node npos = head;

        while(curhead!=null)
        {
            curhead =curhead.next;

            if (pos++ > n)
            {
                npos = npos.next;
            }

        }
        return npos.data;

    }
}
