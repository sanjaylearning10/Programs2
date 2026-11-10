package leetcode;

import java.util.Arrays;


public class PalindromString {

	public static void main(String[] args) {
		String str1="Race";
		String str2="Care";
		boolean flag=true;
		
		char[] char1=str1.toLowerCase().toCharArray();
		Arrays.sort(char1);
		
		char[] char2=str2.toLowerCase().toCharArray();
		Arrays.sort(char2);
		
		
		for(int i=0;i<char1.length;i++)
		{
			if(char1[i]!=char2[i])
			{
				flag=false;
				break;
			}
		}
		
		System.out.print(flag);
	
	}

}
