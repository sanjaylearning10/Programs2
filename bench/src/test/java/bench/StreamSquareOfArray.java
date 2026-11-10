package bench;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class StreamSquareOfArray {

	public static void main(String[] args) {
		int[] array= {4,2,5,8,7,3,7,5};
		List<Integer> list =Arrays.stream(array).map(x->x*x).boxed().collect(Collectors.toList());
		System.out.println("Sum of all elements is "+ list);
		
		
		List<Integer> intList= Arrays.asList(4,2,5,8,7,3,7,5);
		List<Integer>  list1 =intList.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("Sum of all elements is ::"+ list1);
		
		
		
		List<Integer> intList2= Arrays.asList(40,20,50,80,70,30,70,50);
		Double list2 =intList2.stream().map(x->x*x).filter(x->x>100).mapToInt(x->x).average().getAsDouble();
		System.out.println("Sum of all elements is :::=>"+ list2);
	}

}
