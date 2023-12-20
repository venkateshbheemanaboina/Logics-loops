import java.util.Scanner;
class Sumofpositivenegative
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,pnum=0,nnum=0,i=1,limit;
		System.out.println("Enter the limit");
		limit=sc.nextInt();
		while(i<=limit)
		{
			System.out.println("Enter the num");
			num=sc.nextInt();
			if(num==0)
				break;
			else if(num>0)
				pnum=pnum+num;
			else
				nnum=nnum+num;
			i++;
		}
		System.out.println("sum of positive numbers="+pnum);
		System.out.println("sum of negative numbers="+nnum);
	}
}