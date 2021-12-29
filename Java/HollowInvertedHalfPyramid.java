import java.util.*;

class HollowInvertedHalfPyramid {

  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner console = new Scanner(System.in);
    System.out.println("Enter the number of inverted hollow pyramids");
    int n = console.nextInt();
    console.close();

    for(int i = n - 1; i >= 0; i--) {
      for(int j = 0; j <= i; j++) {
        if (i == j) {
          System.out.print("*");
        } else if(j == 0 || i == 0) {
          System.out.print("*");
        } else if (i == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
        System.out.println("");
    }
  }
}