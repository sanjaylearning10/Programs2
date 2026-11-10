package bench;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseOnlyLetter {

	public static void main(String[] args) {
		
				 String s = "12abcdedf4567";
				 reverseOnlyChar(s);
				
	}
	public static void reverseOnlyChar(String str)
	{
		int left=0;
		int right=str.toCharArray().length-1;
		char temp;
		char[] array=str.toCharArray();
		
		while(left<=right)
		{
			if(Character.isLetter(array[left]) && Character.isLetter(array[right]) )
			{
				temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--;
			}
			else if (!Character.isLetter(array[left]) )
			{
				left++;
			}
			else if (!Character.isLetter(array[right]) )
			{
				right--;
			}
		}
		System.out.println(Arrays.toString(array));

		
	}

}
