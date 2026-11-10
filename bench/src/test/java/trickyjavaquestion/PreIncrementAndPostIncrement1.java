package trickyjavaquestion;

public class PreIncrementAndPostIncrement1 {

	public static void main(String[] args) {
		
		int a=11; int b=22;
		int c;
		c=a+b+a++ +b++ + ++a + ++b;
		//11+22+11+22+13+24;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}

}
