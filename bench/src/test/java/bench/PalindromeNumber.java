package bench;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 1001;
		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int x) {

		int reverseNum = 0;
		int original=x;
	
		if (x < 0) {
			return false;
		} else if(x>0){
			while (x % 10 != 0 || x!=0) {
				int n = x % 10;
				x = x / 10;
				reverseNum = reverseNum * 10 + n;
			}	
		}
		return original==reverseNum;
	}
}
