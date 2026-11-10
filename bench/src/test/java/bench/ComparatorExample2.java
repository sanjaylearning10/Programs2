package bench;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample2 {

	
	public static void main(String[] args) {
		Student emp1=new Student("Rohan",30,"QA",12);
		Student emp2=new Student("Sanjay",37,"QA",20);
		Student emp3=new Student("Vivek",42,"QA",02);
		Student emp4=new Student("Sitaram",36,"QA",22);
		Student emp5=new Student("Siva",36,"QA",18);
		Student emp6=new Student("Srenee",36,"QA",18);
		Student emp7=new Student("Deepa",37,"QA",28);
		Student emp8=new Student("Elango",36,"QA",18);
		Student emp9=new Student("Pravallika",26,"QA",17);
		Student emp10=new Student("Pravallika",36,"QA",18);
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
		
		/*
		System.out.println(list);
		Collections.sort(list,new employeeSortingByName());
		System.out.println("Collection after sorting ");
		System.out.println(list);
		*/
		
		System.out.println(list);
		list.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getName));
		System.out.println("Collection after sorting ");
		System.out.println(list);
		
	}
}
	class Student  {

		String name;
		int age;
		String department;
		int id;
		
		Student(String name, int age, String department, int id)
		{
			this.name=name;
			this.age=age;
			this.department=department;
			this.id=id;	
		}
		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public String getName()
		{
			return name;
		}
		
		public String getDepartment()
		{
			return department;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public int getId()
		{
			return id;
		}
		
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", id=" + id + "]";
		}

		
	}
	
	

