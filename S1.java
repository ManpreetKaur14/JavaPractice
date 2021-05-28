import java.util.*;
public class main 
{
public static void main(String[] args) 
    {  Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "JAVA PROGRAMMING";
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf('n'));
        System.out.println(s2.lastIndexOf('M'));
        System.out.println(s2.substring(7));
        System.out.println(s2.substring(7,12));
    }
}