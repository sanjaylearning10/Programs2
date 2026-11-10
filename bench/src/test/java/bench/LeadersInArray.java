package bench;

public class LeadersInArray {

	public static void main(String[] args) {
		LeadersInArray lead = new LeadersInArray();
		int array[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = array.length - 1;
		lead.printLeaders(array, n);
	}

	private void printLeaders(int[] array, int n) {

		System.out.println(n - 1);
		int right_Element = array[n];
		for (int i = n - 1; i >= 0; i--) {
			if (array[right_Element] < array[i]) {
				array[right_Element] = array[i];
				System.out.println(array[right_Element]);
			}
		}
	}
}
