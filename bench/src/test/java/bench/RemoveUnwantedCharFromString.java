package bench;

public class RemoveUnwantedCharFromString {

	public static void main(String[] args) {
		String str="~!@#$Apple|Banana|Cherry%^&*(";
		String strnew=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(strnew);

	}

}
