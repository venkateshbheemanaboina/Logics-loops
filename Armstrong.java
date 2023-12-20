import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,temp1,temp2,rem,sum1,sum=0,y,count=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		temp1=n;
		while(temp1>0)
		{
			temp1= temp1/10;
			count++;
		}	
		temp2=n;
		while(temp2>0)
		{
			rem=temp2%10;	
			sum1=1; y=count;
			while(y>0)
			{
				sum1=sum1*rem;	
				y--;
			}
			sum=sum+sum1;
			temp2=temp2/10;
		}
		if(sum==n)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is Not Armstrong");
	}
}