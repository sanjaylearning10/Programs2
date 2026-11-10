package array;

import java.util.Arrays;

public class MultiplicationOfTwoDArray {

	public static void main(String[] args) {
		int[][] array1= { 
				{ 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } 
                };
		int[][] array2= { 
				{ 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } 
                };
		
		
		int r1=4; 
		int c1=3;
		int r2=3;
		int c2=4;
		int[][] array= new int[r1][c2];	
		
		if(c1!=r2)
		{
			System.out.print("Multiplicate not possible");
			return ;
		}
		else
		{
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array[i].length;j++)
				{
					for(int k=0;k<r2;k++)
					{
						array[i][j]=array[i][j]+array1[i][k]*array2[k][j];
					}
					
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{

				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
