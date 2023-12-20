import java.util.Scanner;
class SumoftheNnumbers
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,num,sum=0,count=0;
		for(i=2;true;i++)
		{
			System.out.println("enter a number");
			num=sc.nextInt();
			if(num!=0)
			{
				sum=sum+num;
				count++;
			}
			else
			{
				break;
			}
			
		}
		float avg=sum/count;
		System.out.println("avg of the given numbers= " +avg);
	}
}