package array;

public class TwoDArray_Display {

	public static void main(String[] args) {
		int[][] array= {{9,8,7},{6,5,4},{3,2,1,0}};
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");	
			}
				System.out.println();
		}
		System.out.print(array[2][0]+" ");	
		
	}

}
