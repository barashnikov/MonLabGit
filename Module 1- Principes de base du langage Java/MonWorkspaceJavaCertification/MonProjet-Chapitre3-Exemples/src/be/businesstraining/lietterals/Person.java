package be.businesstraining.lietterals;

public class Person {
	
	private int age = 22;
	
	public void doSomething() {
	   
		int age = 33;  // Nouvelle déclaration
		
		System.out.println(age);
	}
	public static void main(String[] args) {
		new Person().doSomething();
	}
	
	

}
