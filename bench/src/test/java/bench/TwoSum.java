package bench;

public class TwoSum {

	public static void main(String[] args) {
	int[] array= {4,2,5,8,7,3,7,5};
	
	for(int i=0;i<array.length-1;i=i+2)
	{
		if((array[i]+array[i+1])%2==0)
		{
			System.out.println(array[i]+" "+array[i+1]+ "  indexes are:: "+i+" and "+i+1);
		}
	}

	}

}
