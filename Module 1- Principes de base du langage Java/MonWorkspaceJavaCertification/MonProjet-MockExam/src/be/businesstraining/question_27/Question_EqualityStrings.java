package be.businesstraining.question_27;

public class Question_EqualityStrings {

	public static void main(String[] args) {
		
		
		
		String st1 = "Duke";
		String st2 = "Duke";
		String st3 = new String("Duke");
		String st4 = new String("Duke");
		
//         st1 = st1.concat("Java");
//         st2=	st2.concat("Java");
		
		System.out.println(st3.equalsIgnoreCase(st4)); 
		
//		System.out.println(st1.toString() == st2.toString());
		
//		System.out.println(st1 == st2);  // true
		
//		System.out.println(st1 == st3); //false
		
		
//		StringBuilder sb = new StringBuilder("Duke");
//		String st1 = sb.toString();
//		String st2 = st1;
////		String st2 = sb.toString();
//// 		String st3 = "Duke";
//		System.out.println(st1 == st2);
	}

}
