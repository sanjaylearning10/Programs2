package bench;

import java.util.Arrays;

public class MountainArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 9, 8, 7, 6, 5 ,1,0};

		System.out.println("Check if array is mountain array :: " + checkMountatinArray(array));
	}

	private static boolean checkMountatinArray(int[] array) {
		int i = 0;
		if (array.length < 3) {
			return false;
		}

		while (array[i] < array[i + 1] && (i + 1) < array.length) {
			i++;
		}

		while ((i + 1) < array.length && array[i] > array[i + 1] ) {
			i++;
		}

		if (array.length - 1 == i) {
			return true;
		} else {
			return false;
		}

	}
}
