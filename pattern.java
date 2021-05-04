import java.util.Scanner;

public class pattern {
  Scanner sc = new Scanner(System.in);
  int i, j;

  void pattern1() {
    int n;
    System.out.println("Enter the size::");
    n = sc.nextInt();
    for (i = 0; i < n; i++) {
      for (j = n - i; j > 1; j--) {
        System.out.print(" ");
      }
      for (j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  void pattern2() {
    int n;
    System.out.println("Enter the size.:");
    n = sc.nextInt();
    int k = 0;

    for (int i = 1; i <= n; ++i, k = 0) {
      for (int space = 1; space <= n - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
    }
  }

  void pattern3() {
    int n, k = 1;
    System.out.println("Enter the size:.");
    n = sc.nextInt();
    for (int i = 1; i <= n; i += 2) {
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k++;
      }
      System.out.println();
    }
  }

  void pattern4() {
    int n;
    System.out.println("Enter the size:");
    n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }

      for (int k = 1; k <= i; k++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  void pattern5() {
    int n;
    System.out.println("Enter the size:");
    n = sc.nextInt();
    for (i = 1; i <= n; i += 2) {
      for (j = 1; j <= i; j++) {

        if (j % 2 == 0) {
          System.out.print(0);
        } else {
          System.out.print(1);
        }
      }
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {
    pattern s = new pattern();
    System.out.println("\nPrinting all the pattern");
    System.out.println("\nPrinting pattern 1:");
    s.pattern1();
    System.out.println("\nPrinting pattern 2:");
    s.pattern2();
    System.out.println("\nPrinting pattern 3:");
    s.pattern3();
    System.out.println("\nPrinting pattern 4:");
    s.pattern4();
    System.out.println("\nPrinting pattern 5:");
    s.pattern5();
  }

}
