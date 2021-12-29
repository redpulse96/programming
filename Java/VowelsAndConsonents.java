import java.util.*;

public class VowelsAndConsonents {
  
  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output

    String vowels = "aeiou";
    Scanner console = new Scanner(System.in);
    int T = console.nextInt();
    String[] inStr = new String[T];
    int[] vowelsCount = new int[T];
    int[] consonCount = new int[T];

    for (int j=0; j< T; j++) {
      String inpStr = console.next();
      inStr[j] = inpStr;
    }

    for (int i=0; i<inStr.length; i++) {
      String strArr[] = inStr[i].split("");
      for (int j=0; j<strArr.length; j++) {
        String str = strArr[j];
        if (vowels.contains(str)) {
          vowelsCount[i] += 1;
        } else {
          consonCount[i] += 1;
        }
      }
    }

    for (int i=0; i<T; i++) {
      System.out.println(vowelsCount[i] + " " + consonCount[i]);
    }

    console.close();
  }
}