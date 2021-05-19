public class inheritance 
{
    public static void main(String[] args) 
    {
        ColorTV ob = new ColorTV("LG",32,"LCD");
        ob.display();
        
    }
    
}
 class TV
 {
     String compName;
     int tvSize;
     TV(String a , int b)
     {
         compName = a;
         tvSize = b;
     }
 }

 class ColorTV extends TV
 {
     String tvType;
     ColorTV(String a , int b , String c)
     {
         super(a,b);
         tvType = c ;
     }
     void display()
     {
         System.out.println("Company of Tv = "+compName);
         System.out.println("Size of Tv = "+tvSize);
         System.out.println("Type of Tv = "+tvType);
     }
 }