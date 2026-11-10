package bench;

public class OverrideExample {

	public static void main(String[] args) {
		 Parent1 obj = new Child1();
		 obj.greet();
		 obj.sayBye();

	}
	

}
class Parent1 {
	 static void greet() {
	 System.out.println("Hello from Parent");
	 }

	 void sayBye() {
	 System.out.println("Bye from Parent");
	 }
	}

	class Child1 extends Parent1 {
	 static void greet() {
	 System.out.println("Hello from Child");
	 }

	 
	 void sayBye() {
	 System.out.println("Bye from Child");
	 }
	}

	
	
