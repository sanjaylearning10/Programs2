package leetcode;

public class ReverseWordsInString {
	
	//151. Reverse Words in a String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the sky is blue";
		reverseWords(str);

	}

	 public static String reverseWords(String s) {
		 
		 String[] strChar=s.trim().split("\\s+");
		 StringBuilder sb=new StringBuilder();
		 
		 for(int i=strChar.length-1;i>=0;i--)
		 {
			 System.out.print(strChar[i]+" ");
			 sb.append(strChar[i]+" ");
		 }
		 return sb.toString().trim();
	        
	    }
}
