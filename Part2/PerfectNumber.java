package Part2;
// a number witch sum of the all  divisors is equal to the given number 
// ex 6  1+2+3=6

import java.util.Scanner;

public class PerfectNumber {
	int number,sum=0,rem,factor,i=1;
	public void test1()
	{
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number");;
		number=sc.nextInt();
		while(i<=number/2)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==number)
		{
			System.out.println(number+" is a PERFECT Number");
		}
		else
		{
			System.out.println(number+" is NOT A PERFECT Number");
		}
	}
	public static void main(String [] args)
	{
		PerfectNumber pn= new PerfectNumber();
		pn.test1();
		
	}

}
