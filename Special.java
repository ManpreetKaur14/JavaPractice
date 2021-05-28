import java.util.*;
class Special
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        no_spl ob = new no_spl(); 
        System.out.println("Enter start number: ");
        int n = input.nextInt();
        System.out.println("Enter end number: ");
        int n1 = input.nextInt();
        ob.check(n,n1);        
    }
}
class no_spl
{
    void check(int start, int end)
    { 
        int num, i, rem, temp, counter=0;
        for(i=start+1; i<end; i++)
        {
           temp = i;
           num = 0;
           while(temp != 0)
           {
            rem = temp%10;
            num = num + rem*rem*rem;
            temp = temp/10;
           }
           if(i == num)
           {
            if(counter == 0)
            {
               System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
            }
               System.out.print(i + "  ");
               counter++;
           }
        }
        // if no Armstrong number is found
        if(counter == 0)
        {
           System.out.print("There is no Armstrong number Between "+start+" and "+end);
        }
        }
    }