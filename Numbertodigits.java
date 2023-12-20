import java.util.Scanner;
class Numbertodigits
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		int number,rem,a,rev=0; String result=" ";
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(number>0)
		{
			a=number%10;
			rev=rev*10+a;
			number=number/10;
		}
		
		while(rev>0)
		{
			rem=rev%10;	
			if(rem==1)
				result="one  ";
			else if(rem==2)
				result="two  ";
			else if(rem==3)
				result="three ";
			else if(rem==4)
				result="four  ";
			else if(rem==5)
				result="five  ";
			else if(rem==6)
				result="six  ";
			else if(rem==7)
				result="seven  ";
			else if(rem==8)
				result="eight  ";
			else if(rem==9)
				result="nine  ";
			else
				result="zero   ";
			
			rev=rev/10;
			System.out.print (result);
		}
	}
}