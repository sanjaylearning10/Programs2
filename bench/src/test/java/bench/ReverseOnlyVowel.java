package bench;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseOnlyVowel {

	public static void main(String[] args) {
		String s = "hello";
		reverseOnlyChar(s);
	}

	public static void reverseOnlyChar(String str) {
		int left = 0;
		int right = str.toCharArray().length - 1;
		char temp;
		char[] array = str.toCharArray();
		String vowel = "aeiouAEIOU";

		while (left <= right) {
			if ((vowel.indexOf(array[left]) != -1) && (vowel.indexOf(array[right]) != -1)) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			} else if ((vowel.indexOf(array[left]) == -1)) {
				left++;
			} else if ((vowel.indexOf(array[right]) == -1)) {
				right--;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
