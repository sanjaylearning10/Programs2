package bench;

import java.util.Stack;

public class BalanceParenthesis {

	public static boolean checkp(String str) {
	

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.toCharArray().length; i++) {
			if (str.charAt(i) == '[' | str.charAt(i) == '{' | str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else 
				if (((stack.peek()=='[' && str.charAt(i) == ']' )|| (stack.peek()=='(' && str.charAt(i) == ')')
						||( stack.peek()=='{' && str.charAt(i) == '}')) && (!stack.isEmpty())) {
					stack.pop();
				}
				else {
					return false;
				
				}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.print(checkp("{()[]}"));

	}

}
