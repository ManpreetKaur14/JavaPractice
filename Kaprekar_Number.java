import java.io.*;
import java.util.*;

public class Kaprekar_Number {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        boolean exist = false;
        if(q <= p){
            System.out.println("INVALID RANGE");
            return;
        }
        int m = 0,n = 0;
        long sqr = 0;
        String numb = "";
        String[] digits = new String[2];
        for(long i = p; i <= q; i++){
            if(i == 1)System.out.print(1 + " ");
            else{
            sqr = i*i;
            numb = String.valueOf(sqr);
            if(numb.length() % 2 == 0){
                digits[0] = numb.substring(0, numb.length()/2);
                digits[1] = numb.substring(numb.length()/2);
            }else{
                digits[0] = numb.substring(0, (numb.length() - 1)/2);
                digits[1] = numb.substring((numb.length() -1)/2);
            }
              if(digits[0] == "" )
                  m = 0;
              if(digits[1] == "")
                  n = 0;
              if(!digits[1].equals("") && !digits[0].equals("")){
              m = Integer.parseInt(digits[0]);
              n = Integer.parseInt(digits[1]);
              } 
            if(i == (m + n) ){
                System.out.print(i + " ");
                exist = true;
            }
        }
      }
        if(exist == false){
            System.out.println("INVALID RANGE");
        }
    }
}