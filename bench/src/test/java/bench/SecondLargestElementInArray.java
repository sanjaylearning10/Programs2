package bench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		int num[] = { 5, 13, 41, 88, 99, 77};
		System.out.print(Arrays.stream(num).boxed().sorted(Collections.reverseOrder()).distinct().limit(3).skip(2).findFirst().get());
		
	}

}
