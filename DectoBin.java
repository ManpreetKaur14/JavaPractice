import java.util.*;
class DectoBin
{
  public static void main(String args[])
  {
    int num,temp,reverse=0;
    Scanner in = new Scanner(System.in);
    num=in.nextInt();
    temp=num;
    
    while(temp!=0)
    {
      int d=temp%10;
      reverse=reverse*10+d;
      temp/=10; 
    }
    if(reverse==num)
    {
      System.out.println("Number is palindrome");
    }
    else
    {
      System.out.println("Number is not palindrome");
    }
  }
}