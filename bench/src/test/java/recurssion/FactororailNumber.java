package recurssion;

public class FactororailNumber {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++)
		{
		System.out.println(fact(i));	
		}
		
		//System.out.println(fact(0));	

	}
	public static int fact(int num)
	{
		if (num==0)
		{
			return 1;
		}
		return num*fact(num-1);
		 
	}

}
