import java.util.Scanner;
class Primenumberusingfor
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,num,count=0;
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count>2)
		System.out.println("not a prime number");
		else
		System.out.println("prime number");
	}
}
