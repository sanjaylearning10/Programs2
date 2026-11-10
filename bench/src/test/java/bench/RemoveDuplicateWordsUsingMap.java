package bench;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsUsingMap {

	public static void main(String[] args) {
		String str="India is is my country India country";
        String[] strArray=str.split("\\s+");
        
        System.out.print(strArray.length);        
        
        Set<String> hashSet=new LinkedHashSet<>();
        
        for(int i=0;i<strArray.length;i++)
        {
        	hashSet.add(strArray[i]);
    
        }
    
        System.out.println(hashSet);
	
	

	}

}
