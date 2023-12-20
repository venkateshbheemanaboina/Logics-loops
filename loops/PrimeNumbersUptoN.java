package loops;

import java.util.Scanner;

public class PrimeNumbersUptoN {
	void test1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i=1,j=1,count=0;
		while(i<=n)
		{
			j=1;
			count=0;
			while(j<=i)
			{
				if(i%j==0)
					count++;
				j++;
			}
			if(count==2)
				System.out.println(i);
			
			i++;
		}
	}
	
	void test2()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			int count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
	}
	
	public static void main(String [] args)
	{
		PrimeNumbersUptoN pn=new PrimeNumbersUptoN();
		pn.test1();
		pn.test2();
	}

}
