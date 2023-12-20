import java.util.Scanner;
class LcmandGcd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,i=1,lcm1=0,a,gcd=0;
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the sccond number");
		num2=sc.nextInt();
		if((num1%num2==0)|| (num2%num1==0))
				{
					if(num1>num2)
					{
						System.out.println(num1);
					}
					else
						System.out.println(num2);
				}
		else
		{	
			/*if(num1>num2)	
				{ 
  					a=num1;
				}
			else
				{
					a=num2;
				}*/
			while(i<num1)
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
				
				//System.out.println(lcm);			
	}
}
				

			
			