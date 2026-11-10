package geekforgeek;

public class PalindromString {

	public static void main(String[] args) {
		String s="abcd";
		System.out.println(checkPalindrom(s));
		
	}
	
	public static boolean checkPalindrom(String str)
	{
		boolean index=false;
		
		String reverseString="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseString=reverseString+str.charAt(i);
			System.out.println(reverseString);
		}	
		index=str.equals(reverseString);
		return index;
	}

}
