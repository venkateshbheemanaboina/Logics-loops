package Part2;

import java.util.Scanner;

public class SumofallDigitsinGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,number,rem;
		System.out.println("enter the number");
		number= sc.nextInt();
		while(number>0) 
		{
			rem=number%10;         // i am extracting last digit from the given number
			sum=sum+rem;           // i am adding the extracted value to the sum which initialized with 0 at starting and i am updating my sum every time 
			number=number/10;      // also i am updating my number by dividing with 10 i am removing my last digit from the number
		}
			System.out.println("sum of all the digits is = "+sum);
	}

}
