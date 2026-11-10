package bench;

import java.util.Arrays;

public class FirstNonRepeatingCharcter {
	
	public static void repeatedChar(String array)
	{
		int[] intArray=new int[26];
		
		for(int i=0;i<array.toCharArray().length;i++)
		{
			int indx=array.charAt(i)-97;
	
			intArray[indx]=intArray[indx]+1;
			
		}
		
			System.out.println(Arrays.toString(intArray));	
		
		
		for(int i=0;i<intArray.length;i++)
		{
			if(intArray[i]==1)
			{
				char c=(char) (i+97);
			System.out.println(c);	
			}
		}
	}

	public static void main(String[] args) {
		
		// String s = "racecar";
		 String s = "abbacdaab";
	       repeatedChar(s);
		

	}

}
