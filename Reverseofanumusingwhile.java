import java.util.Scanner;
class Reverseofanumusingwhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rev=0,rem,n,temp;
		n=sc.nextInt();
		temp=n;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("palindrome");
		else
			System.out.println("Not a  palindrome");
		
	}
}