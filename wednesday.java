import java.util.Scanner;

public class wednesday 
{
    public static void main(String[] args) 
    {
        emp ob = new emp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String a=sc.nextLine();
        System.out.println("Enter Company:");
        int c=sc.nextInt();
        ob.show();


        
    }
    
}
class emp{
    static int salary = 12000;
    String name, comp;
    final public int id = 55;
    void getdata(String a, String c)
    {
        name= a;
        comp= c;
    }
    static{
        salary = 10000;
    }
    void show()
    {
        System.out.println("Name:" +name);
        System.out.println("Company:" +comp);
        System.out.println("ID:" +id);
        System.out.println("Salary" +salary);
    }
}
