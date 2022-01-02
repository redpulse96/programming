import java.util.*;
import java.io.*;

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

public class ReverseLinkedList {
  public static void main() {

  }

  int reverseList(Node head) {
    // Your code here.
    Node behind = head;
    Node ahead = head;
    do {
      if (behind.next != null) {
        behind = behind.next;
      }
      if (ahead.next != null) {
        ahead = ahead.next;
      }
      if (ahead.next != null) {
        ahead = ahead.next;
      }
    } while (ahead.next != null);
    int middleElem = behind.data;
    return middleElem;
  }
}