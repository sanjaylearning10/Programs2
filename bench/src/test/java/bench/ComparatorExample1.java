package bench;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee emp1=new Employee("Rohan",30,"QA",12);
		Employee emp2=new Employee("Sanjay",37,"QA",20);
		Employee emp3=new Employee("Vivek",42,"QA",02);
		Employee emp4=new Employee("Sitaram",36,"QA",22);
		Employee emp5=new Employee("Siva",36,"QA",18);
		Employee emp6=new Employee("Srenee",36,"QA",18);
		Employee emp7=new Employee("Deepa",37,"QA",28);
		Employee emp8=new Employee("Elango",36,"QA",18);
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		
		/*
		System.out.println(list);
		Collections.sort(list,new employeeSortingByName());
		System.out.println("Collection after sorting ");
		System.out.println(list);
		*/
		
		System.out.println(list);
		Collections.sort(list,new employeeSortingByAge());
		System.out.println("Collection after sorting ");
		System.out.println(list);
	}
}
	class Employee  {

		String name;
		int age;
		String department;
		int id;
		
		Employee(String name, int age, String department, int id)
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
	
	class employeeSortingByName implements Comparator<Employee> {
		
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

class employeeSortingByAge implements Comparator<Employee> {
		
		public int compare(Employee o1, Employee o2) {
	
			if(o1.getAge()>o2.getAge())
				return 1;
			else if(o1.getAge()<o2.getAge())
				return -1;
			else 
				return 0;
		}
	}


