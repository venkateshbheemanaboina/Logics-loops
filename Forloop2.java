import java.util.Scanner;
class Forloop2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int sum=0,i,num,sign=1;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+i*sign;
			sign=sign*(-1);
		}
		System.out.println(sum);
	}
}