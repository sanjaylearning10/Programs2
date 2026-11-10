package bench;

public class CheckSumOfDigitInString {

	public static void main(String[] args) {
		String str="12xy34abcd56qwe78";
		System.out.print(sumMethod(str));

	}
	
	
	public static int sumMethod(String str)
	{
		int sum=0;
		char[] strArray =str.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<strArray.length;i++)
		{
			if(Character.isDigit(strArray[i]))
			{
				sb.append(strArray[i]);
				
			}
			else if(sb.length()>0)
			{
				sum=sum+Integer.parseInt(sb.toString());
				sb.setLength(0);
			}
		}
		return sum;
		
		
	}

}
