package collections;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;


public class DuplicateWordsInString {

	public static void main(String[] args) {
		String str="India is my country my india is the best country";
		String[] strArray=str.toLowerCase().split("\\s");
		Set<String> set=new LinkedHashSet<>();
		
		for(int i=0;i<strArray.length;i++)
		{
			set.add(strArray[i]);
		}
		
		//System.out.println(set);

		Map<String,Integer> hashMap=new LinkedHashMap<>();
		for(int i=0;i<strArray.length;i++)
		{
			if(hashMap.containsKey(strArray[i]))
			{
				hashMap.put(strArray[i], hashMap.get(strArray[i])+1);
			}
			else
			{
				hashMap.put(strArray[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry: hashMap.entrySet())
		{
			System.out.println(entry.getKey());
			
		}
		
	}

}
