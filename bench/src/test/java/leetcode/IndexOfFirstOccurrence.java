package leetcode;

public class IndexOfFirstOccurrence {

	
	//28. Find the Index of the First Occurrence in a String
	public static void main(String[] args) {
		
		String haystack = "sadbutsad";
				String needle = "sad";
		System.out.println(strStr(haystack,needle));

	}
	
public static int strStr(String haystack, String needle) {
	
	return haystack.indexOf(needle);
        
    }

}
