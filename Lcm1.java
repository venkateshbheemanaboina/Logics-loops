import java.util.Scanner;
class Lcm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,i=1,lcm1=0,gcd=0;
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the sccond number");
		num2=sc.nextInt();
		while(i<=num1)
			{
				if((num1%i==0)&&(num2%i==0))
				{	
					gcd=i;
					lcm1=i*(num1/i)*(num2/i); 
				}
				i++;
			
			}
				System.out.println("GCD="+gcd);
				System.out.println("Lcm of the given numbers="+lcm1);
	}	
}
				

			
			