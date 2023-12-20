package Part2;
//taking the number of inputs from the user and finding the biggest among them

import java.util.Scanner;

public class LargestInteger {
	int number1,number2,limit;
	public void test1()                         //test1 here user will defiantly should give the the number of limit the user give
	{
		Scanner sc = new Scanner(System.in);    // user input 
		System.out.println("enter the limt");   
		limit=sc.nextInt();                     //user should give the limit 
		System.out.println("Eneter a number");   
		number1=sc.nextInt();                   //taking the first number from the user outside of the loop
		
		int i=1;                                 // Initializing i with one
		while(i<=limit)                          // checking my i with limit to exit out of the loop
		{
			System.out.println("enter one more number");
			number2=sc.nextInt();                // taking the one more input from the user 
			if(number1<number2)                  // comparing with first number if my number to greater then number1 i am entering into if statement 
				number1=number2;                 // assigning number2 to number1  and updating my number1 value with new value
			i++;                                 // increasing my i value by one
		}
		System.out.println("biggest amoung given numbers ="+number1);   // end of the loop i am printing my number1
	}
		
		public void test2()                       // to exit the loop when the user enter the 0
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the limt");
			limit=sc.nextInt();                   // taking the limit from the user
			int a=0;                              //initializing a with 0
			
			int i=1;                              // initializing i with 1
			while(i<=limit)                       // comparing the limit with i if condition is true entering into the loop
			{ 
				
				System.out.println("enter a number");
				number1=sc.nextInt();             // taking the number from the user 
				
				if(a<=number1)                    // comparing number with a if it is true entering into if block
					a=number1;                    // updating a value with a number value 
				if(number1==0)                    // if user wants to exit the loop without reach the limit user should enter the 0 and user will exit the loop
					break;                        // break to exit the loop 
				i++;                              // increasing the i by 1 value
			}
		
		System.out.println("biggest amoung given numbers ="+a);     //printing the a
	}
	public static void main(String args[])
	{
		LargestInteger li = new LargestInteger();
		li.test1();
		li.test2();
		
	}

}
 