package bench;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


public class StreamSecondLargestNumber {

	public static void main(String[] args) {
		int[] array= {4,2,5,8,7,3,7,5};
		int list =Arrays.stream(array).sum();
		System.out.println("Sum of all elements is "+ list);
		
		
		OptionalInt list1=Arrays.stream(array).reduce((x,y)->x+y);
		System.out.println("Sum of all elements is using new approach:: "+ list1.getAsInt());

	}

}
