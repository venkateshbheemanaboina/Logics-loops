package Part2;

import java.util.Scanner;

public class LcmandGcd {

	public  void type1() {
		Scanner sc = new Scanner(System.in);
		int number1,number2,lcm=0,i=1,gcd=0;       // local variable must initialize  with sum values at declaration of variable
		System.out.println("enter the first number");
		number1=sc.nextInt();
		System.out.println("enter the second number");
		number2=sc.nextInt();
		while (i<=number1)         // we must put <= here
		{
			if(number1%i==0 && number2%i==0)         // first checks this condition and and enter into loop   
			{
				gcd=i;                                // in first litaration the gcd will become 1 because the i value at 1 pass the tow conditions but we are not comeing out of loop we are increasing the i value so that our gcd value will change until we get greatest common divisor 
				lcm=i*(number1/i)*(number2/i);         // lcd value is also same 
			}
			i++;
		}
		System.out.println("LCM of the given numbers = "+lcm);
		System.out.println("GCD of the given numbers = "+gcd);

	}
	
	public void type2()     
	{
		Scanner sc = new Scanner(System.in);
		int number1,number2,i=2,gcd=0;
		System.out.println("enter the first number");
		number1=sc.nextInt();
		System.out.println("enter the second number");
		number2=sc.nextInt();
		while(true)
		{
			if(i%number1==0 && i%number2==0)             // here i am finding the lcm by using the mod i am performing the mod operation on i when the i satisfied both conditions thats my lcm
			{
				break;
			}
			i++;
		}
		System.out.println("lcm of the given number is ="+i);
	}
	

	
	public static void main(String [] args)
	{
		LcmandGcd lg = new LcmandGcd();
		lg.type1();
		
		lg.type2();
		
	}
}




