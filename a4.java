import java.util.Scanner;

class Calculator {
	 int n1,n2;
	 void accept(int n1,int n2) {
		 this.n1=n1;
		 this.n2=n2;
	 }
void display() {
	System.out.println("1st no.= "+n1);
	System.out.println("2nd no.= "+n2);
}
}
class hcf extends Calculator
{
	int h,a;
    void findhcf() 
	{
		super.accept(n1,n2);
		for(int i = 1; i <= n1 || i <= n2; i++) 
		{
			if( n1%i == 0 && n2%i == 0 )
			h = i;
	    }
	}
	void show() 
	{
		System.out.println("HCF= "+h);
	}
}
public class a4{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nos.");
		int n=sc.nextInt();
		int m= sc.nextInt();
		hcf ob = new hcf();
		ob.accept(n,m);
		ob.display();
		ob.findhcf();
		ob.show();
	}
}
