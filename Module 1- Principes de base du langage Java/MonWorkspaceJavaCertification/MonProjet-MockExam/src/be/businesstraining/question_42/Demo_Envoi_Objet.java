package be.businesstraining.question_42;

class MyString {
	String name ;
	public MyString(String name ) {
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "Café";
//	}
}
public class Demo_Envoi_Objet {

	public static void main(String[] args) {
		System.out.println(" Hello : "+new MyString("Java SE 8"));
		System.out.println(" Hello : "+new StringBuilder("Ici StringBuilder - Java SE 8"));
		System.out.println(" Hello : "+new String("Ici String - Java SE 8"));

	}

}
