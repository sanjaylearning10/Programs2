package trickyjavaquestion;

public class PreIncrementAndPostIncrement2 {

	public static void main(String[] args) {
		
		int i=0;
		i=i++ - --i + ++i - i--;
		//0-0+1-1;
		
		System.out.println(i);
		
	}

}
