package Part2;

import java.util.Scanner;

public class ReversetheNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int reverse=0,rem=0,number;
		System.out.println("Enter a number");
		number=sc.nextInt();
		while(number>0)
		{
				rem=number%10;
				reverse=reverse*10+rem;
				number=number/10;
			
		}
		System.out.println(reverse);

	}

}
