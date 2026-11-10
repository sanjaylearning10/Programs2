package bench;

public class SearchIndexPosition {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 9, 18, 27, 36, 45 ,51,60};
		//int k=27;
		int k=60;
		System.out.println(SearchNumber(array,k));
		
		
	}
	
	public static int SearchNumber(int array[],int k)
	{
		int left=0;
		int right=array.length-1;
		int mid=0;
		
		while(left<=right)
		{
			mid=left+(right-left)/2;
			
			if(array[mid]==k)
			{
				return mid;
			}
			else if(array[mid]>k)
			{
				right =mid-1;
			}
			else if(array[mid]<k)
			{
				left=mid+1;
			}
		}
		return left;
	}

}
