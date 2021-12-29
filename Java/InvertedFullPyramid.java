import java.util.*;

public class InvertedFullPyramid {
  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    console.close();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j >= i) {
          System.out.print("* ");
        } else if (j < n) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}