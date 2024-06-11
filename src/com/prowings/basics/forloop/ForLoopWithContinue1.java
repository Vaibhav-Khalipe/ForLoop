package com.prowings.basics.forloop;

public class ForLoopWithContinue1 {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++)
		{
			if(i>4 && i<9)
			{
				continue;
				
			}
			System.out.println("i ="+i);
		}
	}
}
		
		
