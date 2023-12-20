package loops;

import java.util.Scanner;

public class PerfectNumberUptoN {
	void test1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{	
			int j=1,sum=0;
			while(j<i)
			{
				if(i%j==0)
					sum=sum+j;
				j++;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	void test2()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
			int j,sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.println(i);
		}
	}
	
	public static void main(String args[])
	{
		PerfectNumberUptoN pn=new PerfectNumberUptoN();
		//pn.test1();	
		pn.test2();
	}

}
