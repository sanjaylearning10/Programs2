package bench;

import java.util.Arrays;

public class ReverseWordsString {

	public static void main(String[] args) {
		String str="Hello this is my String";
		
		String[] strArray=str.split("\\s");
		
		System.out.println(strArray.length+" "+Arrays.toString(strArray));
		String reverseArray="";
		
		for(int i=strArray.length-1;i>=0;i--)
		{
			
			//System.out.print(strArray[i]+" ");
			reverseArray=reverseArray+strArray[i]+" ";
			
		}
		System.out.print(reverseArray);
	
		
	}
	
}
