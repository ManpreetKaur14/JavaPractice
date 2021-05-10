class exampleshow {
        public static void main(String args[]){
          student s1 = new student();
          s1.showData();
          student.getAge();
          s1.showData();
       }
     }
     
     class student {
     int roll=003;
     String name="Manpreet";
     static int age=10; //initialized to zero only when class is loaded not for each object created.
     
       static void getAge()
       {
         age=18;
       }
        public void showData()
        {
           System.out.println("Name= "+name);
           System.out.println("Roll="+roll);
           System.out.println("Age="+age);
        }
}
