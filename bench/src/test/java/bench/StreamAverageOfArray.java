package bench;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


public class StreamAverageOfArray {

	public static void main(String[] args) {
		int[] array= {4,2,5,8,7,3,7,5};
		double list =Arrays.stream(array).average().getAsDouble();
		System.out.println("Sum of all elements is "+ list);
		
		
		List<Integer> intList= Arrays.asList(4,2,5,8,7,3,7,5);
		double list1 =intList.stream().mapToInt(x->x).average().getAsDouble();
		System.out.println("Sum of all elements is ::"+ list1);
	}

}
