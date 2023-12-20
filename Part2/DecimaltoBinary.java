package Part2;
//conversion from decimal to binary 

import java.util.Scanner;

public class DecimaltoBinary {
	int decimal,binary=0,count,rem;   //declearing variables as instance variables to use all over the code
	public void test1()               // test one method written by the sir 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a decimal number");
		decimal=sc.nextInt();         // taking a input from the 
		int base=1;                   //initiliging base with one this is a local variable if we want to make it also instance variable 
		while(decimal>0)
		{
			rem=decimal%2;             // i am doing mod with 2  because of the base of the binary is 2
			binary=binary+rem*base;    // this is main formula 
			decimal=decimal/2;         // dividing with 2 
			base=base*10;              // i am doing multiplication with my base with 10
		}                              // repeating the loop until my 
		System.out.println(binary);    //printing the binary value at out of the loop
	}
	
	public static void main(String args[])
	{                                  // calling the test1 one method 
		DecimaltoBinary db=new DecimaltoBinary();        // creating the reference variable and object for the test1 method
		db.test1();
	}

}
