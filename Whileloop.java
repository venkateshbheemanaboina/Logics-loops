import java.util.Scanner;
class Whileloop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=1,n;
		n=sc.nextInt();
		while (i<=n)
		{
			if (i%2==0)
				System.out.println(i);
			i++;
		}
	}
}