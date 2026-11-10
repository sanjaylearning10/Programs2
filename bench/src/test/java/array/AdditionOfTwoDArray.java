package array;

import java.util.Arrays;

public class AdditionOfTwoDArray {

	public static void main(String[] args) {
		int[][] array1= {{2,3},{4,5}};
		int[][] array2= {{1,2},{3,4}};
		int[][] array= new int[2][2];		
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[i].length;j++)
			{
				array[i][j]=array1[i][j]+array2[i][j];
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
