package bench;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] array= {1,2,4,5,6};
		
		int actualSum=0;
		int expectedSum=0;
		int requiredNum;
		int naturalSum;
		int requiredNumUsingNatural;
		for(int i:array)
		{
			actualSum=actualSum+i;
		}
		System.out.println(actualSum);

		
		for(int i=0;i<6;i++)
		{
			expectedSum=expectedSum+i;
		}
		System.out.println(expectedSum);
		requiredNum=actualSum-expectedSum;
		System.out.println("Required numbers is ::" + requiredNum);
		
		naturalSum=(6*(6+1))/2;
		requiredNumUsingNatural=naturalSum-actualSum;
		System.out.println("Required numbers is ::" + requiredNumUsingNatural);
	}

}
