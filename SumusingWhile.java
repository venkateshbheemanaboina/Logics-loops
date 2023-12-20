import java.util.Scanner;
class SumusingWhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=1,sum=0,n;
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of " + --i + "  numbers ="+sum);
	}
}