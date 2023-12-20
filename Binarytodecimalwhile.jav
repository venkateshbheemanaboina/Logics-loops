import java.util.Scanner;
class Binarytodecimalwhile
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		int binary,i=0,rem,decimal=0; 
		System.out.println("Enter the number");
		binary=sc.nextInt();
		while(binary>0)
		{
			rem=binary%10;
			decimal=decimal+rem(int)Math.pow(2,i);
			binary = binary/10;
			i++;
		}
		System.out.println(decimal);
	}
}