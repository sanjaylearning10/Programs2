package bench;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class StreamPrintNumberWithPrefix2 {

	public static void main(String[] args) {
		
		
		List<Integer> intList= Arrays.asList(4,2,5,8,7,3,7,5);
		List<Integer>  list1 =intList.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("Sum of all Event elements is ::"+ list1);
		List<Integer>  list2 =intList.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println("Sum of all Odd Elements is ::"+ list2);
		
		
		
		
	}

}
