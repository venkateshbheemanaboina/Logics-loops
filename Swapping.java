import java.util.*;
class Swapping
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter any two numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		/*temp=a;     // using temp variable
		a=b;
		b=temp;*/
		a=a+b;         // using operators
		b=a-b;
		a=a-b;
		System.out.println("a=" +a);
		System.out.println("b="+b);
	}
}