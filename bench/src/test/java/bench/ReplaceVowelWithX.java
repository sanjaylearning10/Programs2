package bench;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplaceVowelWithX {

	public static void main(String[] args) {
		String s = "hello";
		reverseOnlyChar(s);
	}

	public static void reverseOnlyChar(String str) {
		
		char[] array = str.toCharArray();
		String vowel = "aeiouAEIOU";

		for(int i=0;i<array.length;i++)
		{
			if(vowel.indexOf(array[i])!=-1)
			{
				array[i]='x';
			}
			
		}
		
		System.out.println(Arrays.toString(array));

	}

}
