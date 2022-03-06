public class SinglyLinkedList {

  //Represent a node of the singly linked list
  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  //Represent the head and tail of the singly linked list
  public Node head = null;
  public Node tail = null;

  //addNode() will add a new node to the list
  public void addNode(int data) {
    //Create a new node
    Node newNode = new Node(data);

    //Checks if the list is empty
    if (head == null) {
      //If list is empty, both head and tail will point to new node
      head = newNode;
      tail = newNode;
    } else {
      //newNode will be added after tail such that tail's next will point to newNode
      tail.next = newNode;
      //newNode will become new tail of the list
      tail = newNode;
    }
  }

  //display() will display all the nodes present in the list
  public void display() {
    //Node current will point to head
    Node current = head;

    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    System.out.println("Nodes of singly linked list: ");
    while (current != null) {
      //Prints each node by incrementing pointer
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  //deleteNode() will delete a node and rearrange the linked list
  public void deleteNode(int node) {
    Node currNode = head;
    Node nextNode = head;
    if (currNode == null || nextNode.next == null) {
      System.out.println("List is empty");
      return;
    } else {
      nextNode = nextNode.next;
      while (nextNode != null) {
        if (nextNode.data == node) {
          currNode.next = nextNode.next;
          nextNode = null;
          return;
        }
        nextNode = nextNode.next;
        currNode = currNode.next;
      }
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList sList = new SinglyLinkedList();

    int arr[] = { 12, 34, 123, 543, 24, 6, 123, 432, 5, 345, 32, 33 };
    //Add nodes to the list
    for (int i = 0; i < arr.length; i++) {
      sList.addNode(arr[i]);
    }
    sList.display();
    sList.deleteNode(6);
    //Displays the nodes present in the list
    sList.display();
  }
}
