// { Driver Code Starts
import java.util.*;

class LinkedList_Intersection {
  Node head = null;
  Node tail = null;

  public void addToTheLast(Node node) {
    if (head == null) {
      head = node;
      tail = head;
    } else {
      // Node temp = head;
      // while (temp.next != null)
      // temp = temp.next;

      // temp.next = node;
      tail.next = node;
      tail = node;
    }
  }

  /* Function to print linked list */
  void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  /* Driver program to test above functions */
  public static void main(String args[]) {
    /*
     * Constructed Linked List is 1->2->3->4->5->6->
     * 7->8->8->9->null
     */
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();

      int a1 = sc.nextInt();
      Node head1 = new Node(a1);
      Node tail1 = head1;

      for (int i = 1; i < n1; i++) {
        int a = sc.nextInt();
        tail1.next = (new Node(a));
        tail1 = tail1.next;
      }

      int b1 = sc.nextInt();
      Node head2 = new Node(b1);
      Node tail2 = head2;
      for (int i = 1; i < n2; i++) {
        int b = sc.nextInt();
        tail2.next = (new Node(b));
        tail2 = tail2.next;
      }

      int c1 = sc.nextInt();
      Node head3 = new Node(c1);
      tail1.next = head3;
      tail2.next = head3;
      Node tail3 = head3;
      for (int i = 1; i < n3; i++) {
        int c = sc.nextInt();
        tail3.next = (new Node(c));
        tail3 = tail3.next;
      }

      IntersectPoint obj = new IntersectPoint();
      System.out.println(obj.intersectPoint(head1, head2));
      t--;
    }
    sc.close();
  }
}

// } Driver Code Ends

/*
 * Node of a linked list
 * class Node {
 * int data;
 * Node next;
 * Node(int d) { data = d; next = null; }
 * }
 * Linked List class
 * class LinkedList
 * {
 * Node head; // head of list
 * }
 */

class IntersectPoint {

  // Function to find intersection point in Y shaped Linked Lists.
  int intersectPoint(Node head1, Node head2) {
    // code here
    int intersectingPoint = 0;
    int l1 = 1;
    int l2 = 1;
    Node tail1 = head1;
    Node tail2 = head2;

    while (tail1 != null) {
      l1 += 1;
      tail1 = tail1.next;
    }

    while (tail2 != null) {
      l2 += 1;
      tail2 = tail2.next;
    }

    tail1 = head1;
    tail2 = head2;
    int diff = l1 - l2;
    if (diff < 0) {
      while (diff != 0) {
        diff += 1;
        tail2 = tail2.next;
      }
    } else if (diff > 0) {
      while (diff != 0) {
        diff -= 1;
        tail1 = tail1.next;
      }
    }

    while (tail1 != tail2) {
      tail1 = tail1.next;
      tail2 = tail2.next;
    }
    intersectingPoint = tail1.data;
    return intersectingPoint;
  }
}
