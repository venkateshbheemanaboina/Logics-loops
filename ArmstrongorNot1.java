import java.util.Scanner;
import java.util.*;
class ArmstrongorNot1
{				
	static int num1=153;
	public static void main(String args[])
	{
		
		int b=armstrongornot();
		if(num1==b)
			System.out.println("Armstrong");
		else
			 System.out.println("Not a armstrong");
		
	}
		
	static int armstrongornot()
	{
		int sum=0,num2,count=0,rem;
		num2=num1;
		int num3=num1;
		while(num2>0)
		{	count++;
			num2=num2/10;
		}
		while(num3>0)

		{
			rem=num3%10;
			sum=sum+(int)Math.pow(rem,count);
			num3=num3/10;
		}
		return sum;
	}
}
		