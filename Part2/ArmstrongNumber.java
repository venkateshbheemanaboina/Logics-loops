package Part2;
// armstrong number  when the number of digits is the power of every digit and sum of the powers is equal to the given number
// ex  153 here the number of digits is 3 that means 1^3+5^3+3^3 ==153 

import java.util.Scanner;

public class ArmstrongNumber {
	int number,number1,number2,rem,power,sum=0,count=0,count1;
	
	public void test1()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		number1=number;             // i am assigning my number to number1 to keep my number value same
		while(number1>0)             // i am finding the numbers of digits in the given number
		{
			number1=number1/10;      // in every litarartion i am removing my last digit and incresing my count by 1 every time until my number is become 0
			count++;
		}
		number2=number;              // here i am assigning my number to number2 to perform the power operation 
		count1=count;              //  and i am assigning my count to the count1 to keep mu count constant 
		while(count1>0)             // i am comparing my count1 with 0 and decressing every time 
		{
			rem=number2%10;          // taking last digit 
			power=1*(int)Math.pow(rem,count);     // performing pow function to find the power of last digit  
			sum=sum+power;            // initially my sum is 0 and i am adding my power to the sum and storing in sum every time
			number2=number2/10;       // removing last digit and performing same function in loop until my number2 gets zero
			count1--;
		}                              // if my number2 become zero then i am coming of the loop
		
		if(sum==number)             // i am checking my sum with number if they both are equal athe given number is armstrong number
		{
			System.out.println("the given number is a ARMSTRONG number");
		}
		else
		{
			System.out.println("the given number is NOT A ARMSTRONG number");
		}
	}
	
	
	public void test2()
	{	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		number1=number;
		while(number1>0)
		{
			number1=number1/10;
			count++;                                   // same as above 
		}
		number2=number;
		
		while(number2>0)                                // checking my number2 with 0 this loop is perform until my number2 become 0
		{	
			count1=count;                                //assigning my count to count1 too keep my count value constant if we rae not assigning to count after first litaration my count value will be 0
			power=1;                                      // same as count i am assigning 1 to power if we are not initilize with 1 the power value will not change after the litaration
			rem=number2%10;
			while(count1>0)
			{
				power=power*rem;
				count1--;
			}
			sum=sum+power;
			number2=number2/10;
			
		}
		if(number==sum)
		{
			System.out.println(sum+" is a ARMSTRONG number");
		}
		else
		{
			System.out.println(sum+" is NOT A ARMSTRONG number");
		}
	}
	
	
	public static void main(String [] args )
	{
		ArmstrongNumber an=new ArmstrongNumber();
		//an.test1();
		an.test2();
	}
	
}
