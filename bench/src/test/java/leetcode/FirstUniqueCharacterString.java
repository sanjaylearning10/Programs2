package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {

	// 387. First Unique Character in a String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "leetcode";
		String s = "aabb";
		// String s = "loveleetcode";
		System.out.print(firstUniqChar(s));

	}

	public static int firstUniqChar(String s) {

		int index = -1;
		Map<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			int value = hashMap.getOrDefault(s.charAt(i), 0);
			hashMap.put(s.charAt(i), value + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (hashMap.get(s.charAt(i)) == 1) {
				index = i;
				break;
			}
		}

		return index;

	}
}
