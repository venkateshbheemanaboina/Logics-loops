package Part2;
// strong number the sum of the factorial of every digit in the given number if equal to the given number then that number is strong number 
//145 1!+4!+5!==145 

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number,temp,factorial,sum=0,rem;
		System.out.println("Enter a number");
		number=sc.nextInt();
		temp=number;
		while(temp>0)
		{   
			factorial=1;
			rem=temp%10;
			while(rem>0)
			{
				factorial=factorial*rem;
				rem--;
			}
			sum=sum+factorial;
			temp=temp/10;
		}
		if(sum==number) 
		{
			System.out.println(number+" is a STRONG Number");
		}
		else 
		{
			System.out.println(sum+" NOT A STRONG Number");
		}
	}

}
