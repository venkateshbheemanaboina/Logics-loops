package Part2;

import java.util.Scanner;

public class FirstandLastdigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int first_digit=0,last_digit=0,number,sum;
		System.out.println("enter a number");
		number=sc.nextInt();
		last_digit=number%10;        // here i am getting my last digit of the given number by using the module operation
		while(number>0)              // Checking the condition 
		{
			first_digit=number%10;   // the same method i am using here to get my last digit  but i am writing my logic inside the loop to repeat the process
			number=number/10;         // here i am updating my number by dividing with 10 i am removing the last digit every time until i will get my number 0
		}
		System.out.println("first_digit is ="+first_digit);
		System.out.println("last_digit is ="+last_digit);
		sum=first_digit + last_digit;    // assigning my first and last digit values to the sum variable and i am printing the sum
		System.out.println("sum of first and last digits is ="+sum);
	}

}
