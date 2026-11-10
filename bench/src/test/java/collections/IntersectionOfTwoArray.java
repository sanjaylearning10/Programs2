package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 1 };
		int[] b = { 3, 1, 3, 4, 1 ,2};

		Set<Integer> set = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			if (set.contains(b[i])) {
				intersection.add(b[i]);
			}
		}

		System.out.println(intersection);
	
	}

}
