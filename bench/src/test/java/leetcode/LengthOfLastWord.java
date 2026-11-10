package leetcode;

public class LengthOfLastWord {
	
	//58. Length of Last Word

	public static void main(String[] args) {
	String str="hello world";
	
	String[] strArray=str.toLowerCase().trim().split("\\s");
	
		String lastWord=strArray[strArray.length-1];
	System.out.println(lastWord.length());	
	

	}

}
