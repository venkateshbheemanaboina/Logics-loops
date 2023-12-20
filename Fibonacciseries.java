import java.util.Scanner;
class Fibonacciseries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int limit,feb1=0,feb2=1,feb3,count=2;
		System.out.println("Enter the limit");
		limit=sc.nextInt();
		System.out.print(feb1+" "+feb2+" ");
		do 
		{
			feb3=feb1+feb2;
			System.out.print(feb3+" ");
			feb1=feb2;
			feb2=feb3;
			count++;
		}
		while(count<limit);
	}
}