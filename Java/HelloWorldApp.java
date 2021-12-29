public class HelloWorldApp {

  public static void main(String[] args) {
    int x[][] = new int[10][10];
    int y[][] = new int[10][10];

    System.out.println(x.length);

    for (int i = 0; i<x.length; i++) {
      for (int j = 0; j<x.length; j++) {
        x[i][j] = i + j + 1;
      }
    }

    for (int i = 0; i<x.length; i++) {
      for (int j = 0;   j<x.length; j++) {
         y[i][j] = x[i][j];
      }
    }

    for (int i = 0; i<x.length; i++) {
      for (int j = 0;   j<x.length; j++) {
         System.out.print(y[i][j]);
         System.out.print("\t");
      }
      System.out.print("\n");
    }
  }
}