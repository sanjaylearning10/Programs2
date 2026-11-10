package bench;

public class Override {
	 public static void main(String[] args) {
		Child c= new Child();
		
		 }

}
 class Parent {
	 
	 Parent() {
	 callMe();
	 }

	 void callMe() {
	 System.out.println("Inside Parent");
	 }
	}
class Child extends Parent {
	 int x =10;
	 int y=30;

	 Child() {
	 x = 20;
	
	 }
	 
	 void callMe() {
		
	 System.out.println("Inside Child, x = " + x +" "+ y);
	 }

	
	}