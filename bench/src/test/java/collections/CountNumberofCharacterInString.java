package collections;

public class CountNumberofCharacterInString {

	public static void main(String[] args) {
		String str="aabbbcccddddaabb";
		//a2b3c3d4a2b2
		StringBuilder sb=new StringBuilder();
		
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
				
			
			}
			else
			{
				sb.append(str.charAt(i-1));
				sb.append(count);
				count=1;
			}
			
		}
		sb.append(str.charAt(str.length()-1));
		sb.append(count);

		System.out.println(sb);
	}

}
