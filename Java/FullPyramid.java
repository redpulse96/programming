import java.util.*;

public class FullPyramid {
  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    console.close();

    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= n; j++) {
        if (i > j) {
          System.out.print(" ");
        } else if (i <= j) {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}