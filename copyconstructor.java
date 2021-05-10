       class copyconstructor{
        int roll;
        int age;
        String name;
         
        copyconstructor()
        {
          
          roll=12;
          age=22;
          name="Monica";
        }
        copyconstructor(int r, int a, String n)
        {
          roll=r;
          age=a;
          name=n;
        }
        copyconstructor(copyconstructor s)
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
          copyconstructor ob1= new copyconstructor();
          copyconstructor ob2= new copyconstructor(12,22,"Joey");
          copyconstructor ob3= new copyconstructor(ob2);

          System.out.println("-------Non Parameter Constructor-----------");
          ob1.display();
          System.out.println("---------Parameterised Constructor----------");
          ob2.display();
          System.out.println("--------Copy Constructor-----------");
          ob3.display();
        }
      }
    