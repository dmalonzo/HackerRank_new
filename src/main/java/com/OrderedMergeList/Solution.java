package main.java.com.OrderedMergeList;

public class Solution {
    /*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node mergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if (headA == null && headB == null)
        {
            return null;
        }

        if (headA == null)
        {
            return headB;
        }else
        if (headB == null)
        {
            return headA;
        }

        if(headA.data <= headB.data)
            headA.next = mergeLists(headA.next, headB);
        else {
            Node tmp = headB;
            headB = headB.next;
            tmp.next = headA;
            headA = tmp;
            headA.next = mergeLists(headA.next, headB);
        }
        return headA;


    }

}
