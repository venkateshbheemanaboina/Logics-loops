package Part2;
// conversion from one form to another form binary in terms of 1s and 0s only

import java.util.Scanner;


public class Binarytodecimal {
	int binary,decimal=0,number,rem,count=0,base;  // declaring the variables as instance variables 
	public void text1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		binary=sc.nextInt();                           // taking a binary value from the user 
		while(binary>0)                                // i am checking the binary with 0 if that condition is true entering into loop
		{
			rem=binary%10;                             // taking a last digit from the given number
			decimal=decimal+rem*(int)Math.pow(2, count);       // by using math function i am calculating last digits 
			binary=binary/10;                          // removing the last digit from the given number
			count++;                                   // i am increasing the count by 1 value
			
		}                                               
		System.out.println(decimal);                    // printing my decimal value of the given binary number
		
	}
	
	public void text2()                                 // creating n new method with text2 name 
	{
		Scanner sc = new Scanner(System.in);             
		System.out.println("Enter a binary number");
		binary=sc.nextInt();                             //  taking the input from the user
		int base=1;                                      // i am initilizing base with 1 
		while(binary>0)                                  // checking the condition 
		{
			rem=binary%10;                                // taking the last digit 
			decimal=decimal+rem*base;                     // formula for calculating decimal
			binary=binary/10;                             // removing the last digit from the given binary number
			base=base*2;                                  // base *2 to update base value
			
		}
		System.out.println(decimal);                       // printing the decimal
	}
	
	public static void main(String args[])
	{
		Binarytodecimal bd=new Binarytodecimal();
		bd.text1();
		bd.text2();
	}
	

}
