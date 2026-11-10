package bench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamDuplicateElementInArray {

	public static void main(String[] args) {
		
		
		List<Integer> intList= Arrays.asList(2,1,2,3,8,3,6,2,1,3);
		Set<Integer>  list1 =intList.stream().filter(x->Collections.frequency(intList, x)>1).collect(Collectors.toSet());
		System.out.println("Sum of all elements is ::"+ list1);
		
		
		List<String> strList= Arrays.asList("India","is","is","country","country","my");
		Set<String>  list2 =strList.stream().filter(x->Collections.frequency(strList, x)>1).collect(Collectors.toSet());
		System.out.println("Sum of all elements is ::"+ list2);
		
		
		
		
	}

}
