public class studentthis
{ 
   String name; 
   int rollno; 

studentthis(String name, int rollno) 
   { 
     this.name=name;
     this.rollno=rollno; 
    } 
void display(String name, int rollno) 
{ 
   System.out.println("Local:");
   System.out.println(name+ " "+rollno);
   System.out.println("Global:"); 
   System.out.println(this.name+ " "+this.rollno); 

 } 
public static void main(String[] args) 
{ 
studentthis s = new  studentthis("DEEPAK", 123); 
     s.display("Ajay",456); 
  } 
}