import java.util.*;
class Primenumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,flag=0,count=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();
	
		for(i=2;i<=n;i++)
		{
			flag=0;
				for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.print(i+" ");
					count++;
				}
		}
			System.out.println(count);
	}
}