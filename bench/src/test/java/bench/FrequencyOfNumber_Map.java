package bench;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumber_Map {

	public static void main(String[] args) {
	String str="Hello java world";
	Map<Character,Integer> hashMap=new HashMap<Character, Integer>();
	
	for(int i=0;i<str.toCharArray().length;i++)
	{
		if(hashMap.containsKey(str.charAt(i)))
		{
			hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			
		}
		else {
			hashMap.put(str.charAt(i), 1);
			
		}
	}
	
	hashMap.forEach((x,y)->System.out.println(x+" "+y));

	}

}
