public class Student{
  int roll;
  int age;
  String name;
   
  Student()
  {
    roll=12;
    age=22;
    name="Monica";
  }
  Student(int r, int a, String n)
  {
    roll=r;
    age=a;
    name=n;
  }
  Student(Student s)
  {
    age=s.age;
    name= s.name;
    roll=s.roll;
  }
  void display()
  {
    System.out.println(name);
    System.out.println(age);
    System.out.println(roll);

  }
  public static void main(String[] args) 
  {
    Student ob1= new Student();
    Student ob2= new Student(12,22,"Joey");
    Student ob3= new Student(ob2);
    
    ob1.display();
    ob2.display();
    ob3.display();
  }
    
}
