import java.util.Scanner;
class PrimeFactorsusingforloop
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,num;
		System.out.println("enter a number");
		num=sc.nextInt();
		for(i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				System.out.print(i+" ");
				num=num/i;
			}
		}
		if(num>2)
			System.out.print(num);
	}
}