package be.businesstraining.question_9;


public class Person {
	int age;
	boolean marie;
	Person epouse;
	
	public Person() {
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Age: "+p.age+ " Mari�: "+p.marie+ " Epouse: "+ p.epouse);
	}

}
