package bench;

public class SlidingWindow {

	public static void main(String[] args) {
		int array[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = array.length;
        System.out.println(maxSum(array, n, k));

	}

	private static int maxSum(int[] array, int n, int k) {
		
		int max_sum=0;
		
		for(int i=0;i<k;i++)
		{
			max_sum=max_sum+array[i];
		}
		int window_sum=max_sum;
		
		for(int i=k;i<n;i++)
		{	
			window_sum=window_sum+array[i]-array[i-k];
			max_sum=Math.max(max_sum, window_sum);
		}
		
		return max_sum;
	}

}
