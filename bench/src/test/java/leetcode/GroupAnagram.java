package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	// 49. Group Anagrams
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagramsCategorizeBySorting(strs));

	}

	public static List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {

		List<List<String>> resultList = new ArrayList<>();

		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}

		Map<String, List<String>> stringAnagramMap = new HashMap<>();

		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String key = String.valueOf(arr);

			if (!stringAnagramMap.containsKey(key)) {
				stringAnagramMap.put(key, new ArrayList<>());
			}

			stringAnagramMap.get(key).add(s);

		}

		for (Map.Entry<String, List<String>> entry : stringAnagramMap.entrySet()) {
			resultList.add(entry.getValue());
		}

		return resultList;

	}
}
