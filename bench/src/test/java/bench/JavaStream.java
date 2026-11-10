package bench;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {
		List<Integer> list= List.of(9,8,7,6,4,3,2,0,4,5,1,8,9,0,5);
		
		
		List<Integer> ll=list.stream().distinct().collect(Collectors.toList());
		System.out.print(ll);
		System.out.println();
		System.out.print(list.stream().distinct().collect(Collectors.toList()));
		System.out.println();
		System.out.print(list.stream().sorted().collect(Collectors.toList()));
		System.out.println();
		System.out.print(list.stream().filter(x->x%2==0).distinct().collect(Collectors.toList()));
		System.out.println();
		System.out.print(list.stream().map(x->x*2).collect(Collectors.toList()));
		
	}

}
