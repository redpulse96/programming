public class MiddleElement {

  public static void main() {}

  int getMiddle(Node head) {
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
