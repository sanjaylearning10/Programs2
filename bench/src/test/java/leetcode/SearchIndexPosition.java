package leetcode;

public class SearchIndexPosition {
//35. Search Insert Position
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target=2;
	
		System.out.println(searchIndex(nums,target));
		

	}
	public static int searchIndex(int nums[], int target)
	{
		int low=0;
		int high=nums.length-1;
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target)
			{	
				high=mid-1;
			}
			else if(nums[mid]<target)
			{
				low=mid+1;
			}
					
		}
		return low;
	}

}
