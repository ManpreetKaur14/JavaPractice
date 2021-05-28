public class STR
{
    public static void main(String[] args) 
    {
            String s1="BINGO";  
            char[] ch=s1.toCharArray();  
            for(int i=0;i<ch.length;i++)
            {  
            System.out.println(ch[i]);  
            }  
            String strInput = "I LIKE CATS";
            char ch1 = strInput.charAt(0);
            char ch2 = strInput.charAt(5);
            char ch3 = strInput.charAt(10);
            System.out.println("Character at 0th index is: " + ch1);
            System.out.println("Character at 5th index is: " + ch2);
            System.out.println("Character at 10th index is: " + ch3);
   }
}