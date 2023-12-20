import java.util.Scanner;
class Swappingfirstandlastdigits
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		int number,firstdigit=0,lastdigit,digit,count=0,result,temp1,temp2; 
		System.out.println("Enter the number");
		number=sc.nextInt();
		lastdigit=number%10;
		temp1=number;
		while(temp1>0)
		{
			temp1=temp1/10;
			count++;
		}
		temp2=number;
		while(temp2>0)
		{
			firstdigit=temp2%10;
			temp2=temp2/10;
			
		}
		//firstdigit=1;
		digit=count-1;
		result=lastdigit;
		result=result*(int)Math.pow(10,digit);
		result=result+number%(int)Math.pow(10,digit);
		result=result-lastdigit;
		result=result+firstdigit;
		System.out.println(result);
	}
}