import java.util.Scanner;

class wednesday2 
{
    int roll;
    String name;
    wednesday2(String n, int r)
    {
        roll = r;
        name = n;
    }
    wednesday2 getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String n=sc.nextLine();
        System.out.println("Enter the roll:");
        int r=sc.nextInt();
        wednesday2 data =new wednesday2(n,r);
        return data;
    } 
} 
  
class obj{
public static void main(String[] args) 
    {
        wednesday2 ob1 =new wednesday2("preet", 12);
        wednesday2 ob2;
        ob2=ob1.getdata();
        System.out.println("Roll No: "+ob1.roll+" Name: "+ob1.name);
        System.out.println("Roll No: "+ob2.roll+" Name: "+ob2.name);  
    }
    
}
