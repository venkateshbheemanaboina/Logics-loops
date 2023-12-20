package Part2;

import java.lang.constant.ConstantDescs;
import java.util.Scanner;

public class PrimeorNoy {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number,i=1,count=0;
		System.out.println("Enter a number");
		number=sc.nextInt();
		while(i<=number)
		{
				if(number%i==0)
				{
					count++;
				}
				i++;
		}
		if(count==2)
		{
			System.out.println("given number is a prime number");
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
	}

}
