package bench;

public class SumOfElementInArray {

	public static void main(String[] args) {
		
		int array[] = new int[] { 16, 17, 4, 3, 5, 2 };
		System.out.println("Sum of arrays of all elements :: "+Sum(array));
	}

	private static int Sum(int[] array) {
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		return sum;
	}
}
