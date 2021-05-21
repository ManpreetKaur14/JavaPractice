import java.util.*;
public class intrest 
{
    public static void main(String[] args) 
    {
    PRI ob = new PRI();
    ob.cal();
    }
}
class PRI 
{
    void cal()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Principal:");
        float p1=sc.nextFloat();
        System.out.println("Enter Time:");
        float n1=sc.nextFloat();
        System.out.println("Enter Rate:");
        float r1=sc.nextFloat();
    float SI=(p1*n1*r1)/100;
    System.out.println("Simple interest: "+SI);
    }
}
