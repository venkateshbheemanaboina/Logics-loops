package Part2;

import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,palindrome=0,rem=0,temp;
		System.out.println("Enter a number");
		number=sc.nextInt();
		temp=number;
		while(number>0)
		{
			rem=number%10;
			palindrome = palindrome*10+rem;
			number=number/10;
			
		}
		if(palindrome==temp)
		{
			System.out.println("The given number is a palindrome");
		}
		else
		{
			System.out.println("the given number is not a palindrome");
		}
	}

}
