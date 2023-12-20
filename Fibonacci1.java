import java.util.Scanner;
class Fibonacci1
{
	public static void main(String args[])
	{
		fibonacci1();
	}
	
	static void fibonacci1()
	{
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=1,i=2,num3=0,n;
		System.out.println("Enter the first number");
		n=sc.nextInt();
		System.out.print(num1+" "+num2+" ");
		while(i<n)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			i++;
			System.out.print(num3+" ");
		}
		
	}	
}