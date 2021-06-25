import java.util.Scanner;

/* wAP to find the volume of the box using parameterized and
 * non-parameterized constructor which 
 * are having w as width,h as height,d as depth  
 */
    class demo {
	int w,h,d;
	float v;
    demo()
	{
		System.out.println("by using non-parameterized constructor ");
	}
    demo(int x,int y,int z)
	{
		System.out.println("by using parameterized constructor");
		w=x;
		h=y;
		d=z;
	}
	void  display() {
		v=w*h*d;
		System.out.println("the volume of the b0x is "+v);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the depth of the box ");
			int dep=sc.nextInt();
		System.out.println("enter the lenght of the box ");
			int wid=sc.nextInt();
		System.out.println("enter the lenght of the box ");	
			int hig=sc.nextInt();
            demo v1=new demo();
		v1.display();
        demo v2=new demo(dep,wid,hig);
		v2.display();
	}
}