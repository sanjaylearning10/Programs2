package recurssion;

public class FibonacciNumber {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
		System.out.println(fact(i));	
		}
		//System.out.println(fact(0));	

	}
	public static int fact(int num)
	{
		if (num==0)
		{
			
			return 0;
		}
		
		if (num==1)
		{
			
			return 1;
		}
		
		return fact(num-1)+fact(num-2);
		 
	}

}
