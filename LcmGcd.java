import java.util.Scanner;
class LcmGcd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,gcd;
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the sccond number");
		num2=sc.nextInt();
		
		gcd=lcm_gcd(num1,num2);
               System.out.println("GCD="+gcd);
	
	}
	
	static int lcm_gcd(int num1, int num2)
	{
	  int	i=1,lcm1=0,gcd=0;
		while(i<=num1)
			{
				if((num1%i==0)&&(num2%i==0))
				{	
					gcd=i;
					lcm1=i*(num1/i)*(num2/i); 
				}
				i++;
			}
				System.out.println("Lcm of the given numbers="+lcm1);
		return gcd;
	}	
				
}
				

			
			