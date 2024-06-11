package com.prowings.basics.forloop;

public class ForLoopWithContinueLabel {

	public static void main(String[] args) {
		
		first:
		for(int i=0;i<8;i++)
		{
			System.out.println("i ="+i);
			
			for(int j=0;j<5;j++)
			{
				if(i==4 || j==3)
				{
					continue first;
				}
				System.out.println("j ="+j);
			}
		}

	}

}
