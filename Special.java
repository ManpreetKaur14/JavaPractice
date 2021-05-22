import java.util.*;
class Special
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        no_spl ob = new no_spl(); 
        System.out.println("Enter  a number: ");
        int n = input.nextInt();
        ob.check(n);        
    }
}
class no_spl
{
    void check(int n)
    { 
        int sumOfFactorial =0;
        int r;
        int num = n;
        while (num > 0)
        {
            r = num % 10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sumOfFactorial = sumOfFactorial+fact;
            num = num / 10;
        }
        if(n==sumOfFactorial)
        {
            System.out.println("Special Number" );
        }
        else
        {
            System.out.println("Not Special Number" );
        }
    }
}