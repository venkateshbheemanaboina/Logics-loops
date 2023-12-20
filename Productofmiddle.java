import java.util.Scanner;
class Productofmiddle
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		int number,product=1,rem;
		System.out.println("Enter the number");
		number=sc.nextInt();
		number=number/10;
		while(number>9)
		{
			rem=number%10;
			product=product*rem;
			number=number/10;
		}
		System.out.println("product of middle number="+product);
	}
}