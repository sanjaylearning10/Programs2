package bench;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class StreamPrintEventOddOfArray {

	public static void main(String[] args) {
		
		
		List<Integer> intList= Arrays.asList(2,222,234,567,890,432,236,22,211,29);
		List<Integer>  list1 =intList.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("Sum of all elements is ::"+ list1);
		
		
		
		
		
	}

}
