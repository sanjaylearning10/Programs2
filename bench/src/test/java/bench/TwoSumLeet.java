package bench;

import java.util.Arrays;

public class TwoSumLeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums= {2,7,11,15};
		int[] nums= {3,2,4};
		System.out.println(Arrays.toString(twoSum(nums, 6)));
		

	}
	
	 public static int[] twoSum(int[] nums, int target) {

		        Arrays.sort(nums);
		        int left=0;
		        int right=nums.length-1;
		   
		        
		        while(left<=right)
		        {
		        	int sum=nums[left]+nums[right];
		            if(sum==target)
		            {
		            	return new int[]{left,right};
		              
		            }
		            else if (sum<target){
		                left++;
		            }
		            else
		            {
		               
		                right--;
		            }
		        }
		        throw new IllegalArgumentException("not found");
		           
		    }  
	}


