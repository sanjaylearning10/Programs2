package bench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyOfNumber_Frequency {

	public static void main(String[] args) {
	String str="Hello java world";
	Set<Character> hashSet=new HashSet<Character>();
	List<Character> listChar=new ArrayList<>();
	
	for(int i=0;i<str.toCharArray().length;i++)
	{
		listChar.add(str.charAt(i));
	}
	
	for(int i=0;i<str.toCharArray().length;i++)
	{
		hashSet.add(str.charAt(i));

	}
	for(char c:hashSet)
	{
	
		System.out.println("Get the Frquency :: " + Collections.frequency(listChar,c));

	}
	
	
	}
}
