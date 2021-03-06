// { Driver Code Starts

class ReverseLinkedList {
  static Node head;

  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4, 5, 6, 7, 8 };
    int a1 = arr[0];
    Node head = new Node(a1);
    Node tail = head;
    for (int i = 1; i < arr.length; i++) {
      int a = arr[i];
      // addToTheLast(new Node(a));
      tail.next = new Node(a);
      tail = tail.next;
    }

    Solution1 ob = new Solution1();
    Node res = ob.reverseList(head);
    printList(res);
    System.out.println();
  }

  public static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }
}

class Solution1 {

  public Node reverseList(Node head) {
    // Your code here.
    Node prev = null;
    Node curr = head;

    while (curr != null) {
      Node tmp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = tmp;
    }

    return prev;
  }
}
