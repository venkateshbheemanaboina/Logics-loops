import java.util.Scanner;
class Factorsusingforloop
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,num;
		System.out.println("enter a number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(i+ " ");
		}
	}
}