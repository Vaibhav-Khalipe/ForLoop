package com.prowings.basics.forloop;

public class NestedForLoopWithLabelBreak {

	public static void main(String[] args) {
		
		
		outer:
			for(int i=0;i<=5;i++)
			{
				System.out.println("i="+i);
				
			
		
		inner:
			for(int j=0;j<3;j++)
			{
				if(i==4)
				{
					break outer;
				}
				System.out.println("j ="+j);
			}
		

	}

}
}