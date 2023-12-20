package Part2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int feb1=0,feb2=1,feb3=0,number,rem=0,temp,i=0;
		System.out.println("Enter a lenth");
		number=sc.nextInt();
		System.out.print(feb1+ " " +feb2+" ");
		while(i<=number)
		{
			feb3=feb1+feb2;
			System.out.print(feb3+" ");
			feb1=feb2;
			feb2=feb3;
			i++;
		}
		

	}

}
