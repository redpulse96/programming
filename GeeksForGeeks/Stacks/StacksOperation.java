public class StacksOperation {
  int top = -1;
  int[] stack = new int[100];

  public void push(int data) {
    if (top >= stack.length - 1) {
      System.out.println("Stack overflow!");
    } else {
      top += 1;
      stack[top] = data;
    }
    return;
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack is empty!");
      return -1;
    } else {
      int data = stack[top];
      top -= 1;
      return data;
    }
  }

  public void printStack() {
    if (top == -1) {
      System.out.println("Stack is empty!");
      return;
    }
    System.out.println("Stack Elements below");
    for (int i = top; i >= 0; i--) {
      System.out.print(stack[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    StacksOperation stck = new StacksOperation();
    int arr[] = { 12, 34, 123, 543, 24, 6, 123, 432, 5, 345, 32, 33 };

    stck.printStack();

    for (int i = 0; i < arr.length; i++) {
      stck.push(arr[i]);
    }

    stck.printStack();

    stck.pop();
    stck.pop();
    stck.pop();
    stck.push(21);
    stck.push(214);
    stck.push(80);
    stck.pop();
    stck.push(13);
    stck.push(98798);
    stck.push(898309);
    stck.pop();

    stck.printStack();
  }
}
