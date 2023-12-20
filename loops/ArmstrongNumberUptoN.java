package loops;

import java.util.Scanner;

public class ArmstrongNumberUptoN {
	void test1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i=0;
		while(i<=n)
		{	int temp=i,count=0,rem=0,num=0;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			int j=i;
			while(j>0)
			{
				rem=j%10;
				num=num+(int)Math.pow(rem,count);
				j=j/10;
				
			}
			if(num==i)
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
		for(i=0;i<=n;i++)
		{
			int j, rem,num=0,temp,count=0;
			for(temp=i;temp>0;temp=temp/10)
			{
				count++;
			}
			for(j=i;j>0;j=j/10)
			{
				rem=j%10;
				num=num+(int)Math.pow(rem,count);
			}
			if(num==i)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[])
	{
		ArmstrongNumberUptoN an=new ArmstrongNumberUptoN();
		an.test1();
		an.test2();
	}

}
