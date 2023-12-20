import java.util.Scanner;
class Loops1Adam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number,sqr,sqr1,rem,temp,rev=0,rev1=0;
		System.out.println("Enter the a number");
		number=sc.nextInt();
		sqr=number*number;
		temp=number;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
			sqr1=rev*rev;
		while(sqr1>0)
		{
			rem=sqr1%10;
			rev1=rev1*10+rem;
			sqr1=sqr1/10;
		}
		if(sqr==rev1)
		{
			System.out.println("ADAM");
		}
		else
			System.out.println("NOT");
	}
}	
		