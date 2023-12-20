import java.util.Scanner;
class Primeornotusingdowhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int num,count=0,flag=0,i;
		System.out.println("Enter the a number");
		num=sc.nextInt();
		i=2;
		//i=1;
		/*do{
			if(num%i==0)
				count++;
			i++;
		}
		while (i<=num);
		
				if(count==2)
					System.out.println("given number is a prime number");
				else
					System.out.println("given number is not a prime number");*/
		
		do 
		{
			if(num%i==0)
			{	flag=1;
				break;
			}
		 	i++;
		}
		while(i<=num/2);
		
			if(flag==0)
				System.out.println("given number is a prime number");
			else
					System.out.println("given number is not a prime number");
	}
}

	