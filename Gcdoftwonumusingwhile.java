import java.util.Scanner;
class Gcdoftwonumusingwhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,num,den,rem;
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2)
		{
			num=n1;
			den=n2;
		}
		else
		{
			num=n2;
			den=n1;
		}
		rem=num%den;
		while(rem!=0)
		{
			num=den;
			den=rem;
			rem=num%den;
		}
			System.out.println("gcd of two num is= "+den);
	}
}