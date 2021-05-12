import java.util.*;
class overload
{
    int add(int a, int b)
    {
        return(a+b);
    }
    int add(int a, int b,int c)
    {
        return(a+b);
    }
    double add(double a, double b)
    {
        return(a+b);
      
    }
    String add(String a, String b)
    {
        return(a+b);
    }

}
public class overloaded
{
    public static void main(String[] args) 
    {
    overload ob1 = new overload();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String h=sc.nextLine();
    String i=sc.nextLine();
    String sum4 = ob1.add(h,i);
    System.out.println("Sum= "+sum4);
    System.out.println("Enter the numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum1 = ob1.add(a,b);
    System.out.println("Sum= "+sum1);
    System.out.println("Enter the numbers");
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    int sum2 = ob1.add(c,d,e);
    System.out.println("Sum= "+sum2);
    System.out.println("Enter the numbers");
    double f=sc.nextDouble();
    double g=sc.nextDouble();
    double sum3 = ob1.add(f,g);
    System.out.println("Sum= "+sum3);
}
}