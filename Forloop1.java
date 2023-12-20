import java.util.Scanner;
class Forloop1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int sum=0,i,num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;)
		{	
			sum=sum+i*(++i);
			
		}
			System.out.println(sum);
	} 
}