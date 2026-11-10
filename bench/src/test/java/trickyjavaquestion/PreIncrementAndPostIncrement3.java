package trickyjavaquestion;

public class PreIncrementAndPostIncrement3 {

	public static void main(String[] args) {
		
		int i=19; int j=29; int k=39;
		int m;
		m=i-- - j-- - k--;
		// 19 - 29- 39
		//18 28 38
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		
	}

}
