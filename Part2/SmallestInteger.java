package Part2;
//taking a input from the user and finding the smallest number among them
import java.util.Scanner;

public class SmallestInteger {
	int number1,number2,limit;
	public void test1()                           // test1 is method 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();                     // Taking the limit from the user 
		System.out.println("Enter a number");
		number1=sc.nextInt();                     //taking the number  from the user 
		int i=1;                                  // initializing i with one
		while(i<limit)                            // comparing i with limit if it is true entering into loop
		{
			System.out.println("Enter a number");  
			number2=sc.nextInt();                 // taking the another number from the user
			if(number1>number2)                   //comparing number1 with number2 if it is true it will enter into if block
				number1=number2;                  // and assigning number2 with number1 
			i++;                                  // Increasing i value by one
		}
		System.out.println("smallest number in given number is "+number1);
	}
	
	
	public void test2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		System.out.println("Enter a number");
		number1=sc.nextInt();                     //taking the number1 from the user 
		int i=1;  
		while(i<limit)
		{
			System.out.println("Enter a number");
			number2=sc.nextInt();                // taking the number2 from the user and i am placing this line in loop
			if(number1==0)                       // if number gives the 0 then it will come out of the loop 
				break;                           // break is used to exit from the loop
			if(number2==0)
				break;
			if(number1>number2)                  // comparing the number1 and number2 if it is true it will enter into if block
				number1=number2;                 // assigning the number2 to number1 
			i++;
		}
		System.out.println("smallest number in given number is "+number1);   //printing the number1
	}
	
	public static void main(String args[])
	{
		SmallestInteger si=new SmallestInteger();
		si.test1();
		si.test2();
				
	}
}
