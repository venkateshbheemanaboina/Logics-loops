import java.util.Scanner;
class Digitcountusingwhile
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num,count=0,digit,rem;
		System.out.println("Enter the N value");
		num=sc.nextInt();
		System.out.println("enter the digit");
		digit=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			if(rem==digit)
			{
				count++;
			}
			num=num/10;
		}
			System.out.println("accurence of "+digit+" in num = "+count);
	}
}
		
		