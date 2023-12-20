package Part2;

import java.util.Scanner;

class Countthedigit {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				int number,count=0;
				System.out.println("Enter the number");
				number = sc.nextInt();
				while(number>0)                 // here first check the condition weather it is true it will enter in to loop  
				{
					number=number/10;           // here number value will updated into number of digits-1    
					count++;                     // here count will increase 
				}
				System.out.println("the number of digits in the given number is="+count);
	}

}
