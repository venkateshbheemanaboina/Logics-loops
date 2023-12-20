package Part2;

import java.util.Scanner;

public class SumofEven {
	int number,limit;
	public void test1()                             //test one for sum of all given even numbers 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=limit)
		{
			System.out.println("Enter a number");
			number=sc.nextInt();                 // taking the input from the user and keeping that in loop to repeat the user input
			if(number%2==0)                     // checking the the given number even or odd
			{
				sum=sum+number;                  // if that is even adding with sum which is already initializing with zero
			}
			i++;
		}
		System.out.println("sum of given even numbers is "+sum);
	}
	
	public void test2()                        // test2 for sum of all given odd numbers
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=limit)
		{
			System.out.println("Enter a number");
			number=sc.nextInt();
			if(number%2!=0)
			{
				sum=sum+number;
			}
			i++;
		}
		System.out.println("sum of given Odd numbers is "+sum);
	}
	
	public static void main(String args[])
	{
		SumofEven se=new SumofEven();
		se.test1();
		se.test2();
	}

}
