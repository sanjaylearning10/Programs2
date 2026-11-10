package bench;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 0, 0, 6, 0, 1, 0, 7, 4, 0, 3, 0, 0, 0, 0, 5, 2, 0 };
		MoveZero(array);
		System.out.println("Sum of arrays of all elements :: " + Arrays.toString(array));
	}

	private static void MoveZero(int[] array) {
		int left = 0;
	
		int temp;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				temp=array[i];
				array[i]=array[left];
				array[left]=temp;
				left++;
			}
		}

		
	}
}
