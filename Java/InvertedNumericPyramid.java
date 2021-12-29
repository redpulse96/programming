import java.util.*;

public class InvertedNumericPyramid {
  
  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    console.close();

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = n - 1; j >= 0; j--) {
        sum++;
        if (j > i) {
          System.out.print(sum + " ");
        } else if (i == j) {
          System.out.print(sum);
        }
      }
      System.out.println();
    }
  }
}
