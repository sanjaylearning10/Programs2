package bench;

public class LengthOfWord {

	public static void main(String[] args) {
		
		//String str="Hello World";
		String str="fly    me to  the moon         ";
		
		String [] strArray=str.trim().split("\\s+");
		
		String lastWord=strArray[strArray.length-1];
		
		
		System.out.println(strArray.length);
		System.out.println(str.length());
		System.out.println(lastWord.toCharArray().length);

	}

}
