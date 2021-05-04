import java.util.*;
class series {
  Scanner sc = new Scanner(System.in);
  int i;
  void series1() {
    System.out.println("\nEnter the size(odd number)");
    int n = sc.nextInt();
    for (i = 1; i <= n; i++) {
      if (i % 2 != 0)
        System.out.print(i + " ");
    }
  }
  void series2() {
    System.out.println("\nEnter the size(even number)");
    int n = sc.nextInt();
    for (i = 1; i < n; i++) {
      if (i % 2 == 0)
        System.out.print(i + " ");
    }
  }
  void series3() {
    System.out.println("Enter the size(odd number)");
    int n = sc.nextInt();
    for (i = 1; i < n; i++) {
      int c = i * i + 1;
      System.out.print(c + " ");
    }
  }
  void series4() {
    System.out.println("Enter thr size of the series:");
    int n = sc.nextInt();
    System.out.println("Enter the value of x for the series:");
    int x = sc.nextInt();
    int sum = 1;
    int no_row = 1;
    for (i = 1; i < n; i++) {
      no_row = no_row * x / i;
      sum = sum + no_row;
    }
    System.out.print("The sum: " + sum);
  }
  void series5() {
    System.out.println("Enter thr size");
    int n = sc.nextInt();
    System.out.println("Enter the value of x");
    int x = sc.nextInt();
    int sum = 1, m = -1;
    int ctr, mm, nn;
    for (i = 1; i < n; i++) {
      ctr = (2 * i + 1);
      mm = x * ctr;
      nn = mm * m;
      sum = sum + nn;
      m = m * (-1);
    }
    System.out.print("The sum is" + sum);
  }
  void series6() {
    System.out.println("Enter thr size");
    int n = sc.nextInt();
    System.out.println("Enter the value of x");
    int x = sc.nextInt();
    int sum = 1, t = 1;
    int d;
    for (i = 1; i < n; i++) {
      d = (2 * i) * (2 * i - 1);
      t = -t * x * x / d;
      sum = sum + t;
    }
    System.out.print("The sum is" + sum);
  }
  public static void main(String[] args) {
    series s = new series();
    System.out.println("\nPrinting all the series");
    System.out.println("\nPrinting series 1:");
    s.series1();
    System.out.println("\nPrinting series 2:");
    s.series2();
    System.out.println("\nPrinting series 3:");
    s.series3();
    System.out.println("\nPrinting series 4:");
    s.series4();
    System.out.println("\nPrinting series 5:");
    s.series5();
    System.out.println("\nPrinting series 6:");
    s.series6();
  }
}