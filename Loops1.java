import java.util.Scanner;
class Loops1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number,nexthighnum,rem,temp,digit;
		System.out.println("Enter the a number");
		number=sc.nextInt();
		System.out.println("Enter the digit");
		digit=sc.nextInt();
		nexthighnum=number-1;
		while(nexthighnum>0)
		{
			temp=nexthighnum;
			while(temp>0)
			{
				rem=temp%10;
				if(rem==digit)
				{
					nexthighnum--;
					break;
				}
				temp=temp/10;
			}
			
			if(temp==0)
				break;
		}
		System.out.println("The next high number=  "+nexthighnum);
	}
}	