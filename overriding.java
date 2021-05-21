public class overriding {
    public static void main(String[] args) 
    {
        Parent ob = new Parent();
        Child obj = new Child();
        obj.a=200;
        obj.display();
        Parent temp;
        ob.a=20;
        temp = ob;
        ob.display();
        obj.a=100;
        temp = obj;
        obj.display();
        
    }
    
}
class Parent
{
    int a;
    void display()
    {
        System.out.println("Parent class called");
        System.out.println("A="+a);
        System.out.println();
    }  
}  
class Child extends Parent
{
    int a;
    void display()
    {
        System.out.println("Child class called");
        System.out.println("A="+a);
        System.out.println();
    }  
} 
