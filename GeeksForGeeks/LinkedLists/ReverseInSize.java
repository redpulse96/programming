// { Driver Code Starts

class ReverseInSize {
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

    int k = 4;
    Solution ob = new Solution();
    Node res = ob.reverse(head, k);
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

// } Driver Code Ends

class Solution {

  public Node reverse(Node head, int k) {
    // Your code here
    Node node = head;
    Node prev = head;

    while (node != null) {
      Node tmp = node.next;
      node.next = prev;
      prev = node;
      node = tmp;
    }
    return prev;
  }
}
