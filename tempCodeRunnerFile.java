import java.util.Scanner;

public class wednesday2 
{
    int roll;
    String name;
    wednesday2(int r, String n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details:");
        r=sc.nextInt();
        n=sc.nextLine();
        roll = r;
        name = n;
    }
    wednesday2 getdata()
    {
        wednesday2 data =new wednesday2(roll,name);
        return data;
    }  
    public static void main(String[] args) 
    {
        wednesday2 ob1 =new wednesday2(20,"Preet");
        wednesday2 ob2;
        ob2=ob1.getdata();
        System.out.println("Roll No: "+ob1.roll+" Name: "+ob1.name);
        System.out.println("Roll No: "+ob2.roll+" Name: "+ob2.name);   
    }
    
}
