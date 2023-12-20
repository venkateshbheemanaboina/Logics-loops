import java.util.Scanner;
class Primeornot
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,n,count=0;
		System.out.println("Enter the N value");
		n=sc.nextInt();
		/*i=1;
		while (i<=n)
		{
			if(n%i==0)
				count++;
		
			i++;
		}*/
		i=2;
		while(i<=(n/2))
		{
			if(n%2==0)
			{
				count=1;
				break;
			}	
			i++;
		}
		if (count==0)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	}
}
