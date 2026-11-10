package bench;

public class CheckIfStringPangram {

	public static void main(String[] args) {
		String  str = "Abcdefghijklmnopqrstuvwxy12";
		//String  str = "Abcdefghijklmnopqrstuvwxyz12";

		System.out.println("Check if array is mountain array :: " + checkIfStringPangram(str));
		

	}
	
	private static boolean checkIfStringPangram(String str) {
		boolean flag=true;
		
		for(char i='a';i<='z';i++)
		{
			if(!str.toLowerCase().contains(String.valueOf(i)))
			{
				flag=false;
				break;
			}
		}
		
		
		return flag;
				
		
	}

}
