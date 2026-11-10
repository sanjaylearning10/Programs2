package bench;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str="Hello this is my String";
		
		String[] strArray=str.split("\\s");
		
		System.out.println(strArray.length+" "+Arrays.toString(strArray));
		
		for(int i=0;i<strArray.length;i++)
		{
			char[] charArray=strArray[i].toCharArray();
			for(int a=0;a<charArray.length/2;a++)
			{
				char temp=charArray[a];
				charArray[a]=charArray[charArray.length-1-a];
				charArray[charArray.length-1-a]=temp;
			}
			strArray[i]=new String(charArray);
			
	
		}
		System.out.println("After reverse" +Arrays.toString(strArray));

	}
}
