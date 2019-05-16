package be.businesstraining.question_12;

public interface MyInterface {
   
	abstract int m3();
	
	default long m5() {return 1;}
	
	static void m6() {}
	
}
