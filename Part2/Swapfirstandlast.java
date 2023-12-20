package Part2;

import java.util.Scanner;

public class Swapfirstandlast {
	int first_digit,last_digit,number,number1,rem,result,count=0;
	public void test1()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		last_digit=number%10;
		number1=number;
		while(number1>0)
		{
			first_digit=number1%10;
			number1=number1/10;
			count++;
		}
		result=last_digit;
		result= result *(int)Math.pow(10,count-1);
		result=result+number%(int)Math.pow(10,count-1);
		result=result-last_digit+ first_digit;
		System.out.println("the swap of first and last digit "+result);
	}
	public static void main(String args[])
	{
		Swapfirstandlast sf= new Swapfirstandlast();
		sf.test1();
		
	}

}
