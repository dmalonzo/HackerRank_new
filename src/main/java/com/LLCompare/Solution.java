package main.java.com.LLCompare;

public class Solution {
    /*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        int equal =0;

        while(headA != null || headB != null)
        {
            if ((headA.next == null && headB.next != null)||(headA.next != null && headB.next == null))
            {
                return 0;
            }else
            {
                if (headA.data != headB.data)
                {
                    return 0;
                }
                headA = headA.next;
                headB = headB.next;
                equal = 1;
            }
        }
        return equal;

    }
}
