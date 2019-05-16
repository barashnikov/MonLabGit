package be.businesstraining.question_16;

import java.util.ArrayList;

public class Employee {
	String name;
	boolean contract;
	double salary;

	public Employee() {
	}

	public String toString() {
		return "Employee [name=" + name + ", contract=" + contract + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
        Employee e = new Employee();
        e.name = new String("Joe");
        e.contract = true;
        e.salary = new Double(100);
        System.out.println(e);
      //  this.name = "Joe";  // CANNOT USE THIS IN A STATIC CONTEXT ....
	}

}
