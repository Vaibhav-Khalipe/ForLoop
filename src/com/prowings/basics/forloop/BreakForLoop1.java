package com.prowings.basics.forloop;

import java.util.Scanner;

public class BreakForLoop1 {
	
	
	public static void main(String[] args) {
		
		int input=0;
		int sum=0;
		
		//take input command from scanner
		
		Scanner sc= new Scanner(System.in);
		
		for(;;)
		{
			//take input number from user
			
			System.out.println("please enter the number");
			
			// input from scanner
			
			input =sc.nextInt();
			
			if(input<0)
			{
				break;
				
			}
			
			//sum=sum+input
			sum+=input;
			
			System.out.println("the sum is :"+sum);

			
			sc.close();
		}
		
	}
}
	
	
	
