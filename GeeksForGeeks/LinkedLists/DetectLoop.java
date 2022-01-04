// { Driver Code Starts
//Initial template code for JAVA

import java.util.*;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class GFG {

  public static void makeLoop(Node head, Node tail, int x) {
    if (x == 0) return;

    Node curr = head;
    for (int i = 1; i < x; i++) curr = curr.next;

    tail.next = curr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      int num = sc.nextInt();
      Node head = new Node(num);
      Node tail = head;

      for (int i = 0; i < n - 1; i++) {
        num = sc.nextInt();
        tail.next = new Node(num);
        tail = tail.next;
      }

      int pos = sc.nextInt();
      makeLoop(head, tail, pos);

      DetectLoop x = new DetectLoop();
      if (x.detectLoop(head)) System.out.println(
        "True"
      ); else System.out.println("False");
    }
    sc.close();
  }
}

// } Driver Code Ends

// User function template for JAVA

/*
 * Node is defined as
 *
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int d) {data = d; next = null; }
 * }
 *
 */

class DetectLoop {

  // Function to check if the linked list has a loop.
  public boolean detectLoop(Node head) {
    // Add code here
    Boolean flag = false;
    Node ptr1 = head;
    Node ptr2 = head;

    while (ptr1 != null && ptr2 != null) {
      ptr1 = ptr1.next;
      if (ptr2.next != null && ptr2.next.next != null) {
        ptr2 = ptr2.next.next;
      } else {
        break;
      }
      if (ptr1 == ptr2) {
        flag = true;
        break;
      }
    }
    return flag;
  }
}
