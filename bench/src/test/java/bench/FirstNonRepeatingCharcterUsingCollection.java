package bench;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingCharcterUsingCollection {
	
	public static void repeatedChar(String array)
	{
		Set<Character> linkedhashSet=new LinkedHashSet<>();
		
		for(int i=0;i<array.toCharArray().length;i++)
		{
			
			linkedhashSet.add(array.charAt(i));
		}
		System.out.println(linkedhashSet);
	}

	public static void main(String[] args) {
		
		// String s = "racecar";
		 String s = "abbacdaab";
	       repeatedChar(s);
		

	}

}
