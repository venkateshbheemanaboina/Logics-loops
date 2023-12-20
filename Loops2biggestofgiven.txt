import java.util.Scanner;
class Loops2biggestofgiven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number,x=0,rem;
		System.out.println("Enter the a number");
		number=sc.nextInt();
		while(number>0)
		{
			rem=number%10;
				if(rem>x)
					x=rem;
			number=number/10;
		}
		System.out.println("biggest digit="+x);
	}
}
