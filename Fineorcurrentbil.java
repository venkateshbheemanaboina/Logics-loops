import java.util.Scanner;
class Fineorcurrentbil
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n<=5)
		{
			System.out.println(n*0.40);
		}
		else if(n<=10)
		{
			System.out.println(2.00+(n-5)*0.65);
		}
		else
		{
			System.out.println(5.25+(n-10)*0.8);
		}
	}
}