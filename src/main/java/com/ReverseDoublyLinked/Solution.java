package main.java.com.ReverseDoublyLinked;

public class Solution {

    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

    static Node start = new Node();

    Node Reverse(Node head) {

        Node start = head;
        Node temp = new Node();
        Node headt = head;

        while(head != null)
        {
            //set last node to head
            if(head.next == null)
            {
                start = head;
            }
            //swap prev and next

            headt = head.next;
            temp = head.prev;
            head.next = head.prev;
            head.prev = temp;
            head = headt;
        }

        return start;
    }

}
