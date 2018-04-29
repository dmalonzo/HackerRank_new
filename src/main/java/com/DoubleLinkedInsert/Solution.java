package main.java.com.DoubleLinkedInsert;

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

    Node SortedInsert(Node head,int data) {

        Node newn = new Node();
        newn.data = data;


        if (head == null)
        {
            head = newn;
        }else
        if (data < head.data)
        {
            newn.prev = null;
            newn.next = head;
            head.prev = newn;
            head = newn;
        }
        else
        {
            Node curr = head;
            while(curr.next != null && curr.data < data)
            {
                curr = curr.next;
            }

            if (data < curr.data)
            {
                Node prevn = curr.prev;
                prevn.next = newn;
                newn.prev = prevn;
                newn.next = curr;
                curr.prev = newn;
            }else
            {
                curr.next = newn;
                newn.prev = curr;
            }
        }

        return head;

    }
}
