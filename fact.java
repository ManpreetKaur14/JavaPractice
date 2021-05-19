import java.util.*;
class facto 
{
    static int factorial(int n) 
    {
       if (n == 0)
          return 1;
       else
          return (n * factorial(n - 1));
    }
}
class fact
{
    public static void main(String args[])
     {
       facto f = new facto();
       int i, a;
       Scanner sc = new Scanner(System.in);
       int number=sc.nextInt();
       a = f.factorial(number);
       System.out.println(number + "! = " + a);
    }
 }