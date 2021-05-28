import java.util.*;
class Compare
{
	Compare(int x,int y)
	{
        int temp;
        temp = x;
        x=y;
        y=temp;
	    System.out.println("A = "+x);
        System.out.println("B = "+y);
	}
}
class Factorial
{
public static void main(String[] arg)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("A = ");
	a=sc.nextInt();
	System.out.print("B = ");
	b=sc.nextInt();
	Compare c=new Compare(a,b);
}
}