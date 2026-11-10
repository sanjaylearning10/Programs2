package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="sanjay";
		nonRepeatedChar(st.toLowerCase());

	}

	public static void nonRepeatedChar(String str)
	{
		int i=0;
		int j=0;
		int maxLength=0;
		Set<Character> set=new LinkedHashSet<>();
		
		while(i<str.length() && j<str.length())
		{
			if(set.contains(str.charAt(j)))
			{
				set.remove(str.charAt(i));
				i++;
			}
			else
			{
				set.add(str.charAt(j));
				j++;
			}
			maxLength=Math.max(maxLength, j-i);
		}
		System.out.print(set);
		System.out.println(maxLength);
				
	}
}
