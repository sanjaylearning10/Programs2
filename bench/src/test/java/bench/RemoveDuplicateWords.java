package bench;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str="India is is my country India country";
        String[] strArray=str.split("\\s+");
        
        System.out.print(strArray.length);        
        
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
    
       // System.out.println(hashMap);
        hashMap.forEach((x,y)->System.out.print(x+" "));
        
        System.out.println();
	
        
        for(Map.Entry<String, Integer> entry:hashMap.entrySet())
        {
        	if(entry.getValue()>1)
        	{
        		System.out.println(entry.getKey()+" ");
        	}
        	
        }
	

	}

}
