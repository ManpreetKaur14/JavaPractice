import java.util.*; 

public class ReverseString { 

     

    void sort(String name[], int roll[], String stream[]) 

    { 

        for(int i=0;i<10;i++) 

        { 

            for(int j=i+1;j<10;j++) 

            { 

                if(name[i].compareTo(name[i+1])>0) 

                { 

                    String tmp_name=name[i]; 

                    int tmp_roll=roll[i]; 

                    String tmp_stream=stream[i]; 

                    name[i]=name[j]; 

                    roll[i]=roll[j]; 

                    stream[i]=stream[j]; 

                    name[j]=tmp_name; 

                    roll[j]=tmp_roll; 

                    stream[j]=tmp_stream; 

                } 

            } 

        } 

    } 

 
 

    public static void main(String[] args) { 

        ReverseString ob=new ReverseString(); 

        Scanner sc=new Scanner(System.in); 

 
 

        String name[] = new String[10]; 

        int roll[] = new int[10]; 

        String stream[] = new String[10]; 

 
 
 

        for(int i=0;i<10;i++) 

        { 

            System.out.print("Enter the name of student "+(i+1)+": "); 

            name[i]=sc.nextLine(); 

            System.out.print("Enter the Roll of student " + (i + 1) + ": "); 

            roll[i]=sc.nextInt(); 

            System.out.print("Enter the Stream of student " + (i + 1) + ": "); 

            sc.nextLine(); 

            stream[i]=sc.nextLine(); 

 
 

        } 

 
 

        ob.sort(name, roll, stream); 

        System.out.println("Name\tRoll\tStream"); 

        for(int i=0;i<10;i++) 

            System.out.println(name[i]+"\t"+roll[i]+"\t"+stream[i]); 

    } 

}