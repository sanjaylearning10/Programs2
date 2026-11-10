package collections;
import java.util.Map;
import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		Map<String,String> hashMap=new HashMap<>();
		hashMap.put("key1", "value1");
		System.out.println(hashMap.put("key1", "value1"));
		hashMap.put("key2", "value2");
		System.out.println(hashMap.getOrDefault("key2", "value2"));
		
		Map<String,String> hashMap1=new HashMap<>();
		hashMap1.putAll(hashMap);
		hashMap1.forEach((k,v)->System.out.println(k+" "+v));
	}

}
