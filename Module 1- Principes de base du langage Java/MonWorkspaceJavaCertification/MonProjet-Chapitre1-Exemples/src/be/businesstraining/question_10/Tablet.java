package be.businesstraining.question_10;

 interface Gadget {
	 public static final  int SOME_CONSTANT_VALUE= 111;
	 void doStuff();
}

abstract class Electronic {
	void getPower() {
		System.out.println("Plug in ...");
	}
}

public class Tablet  extends Electronic     
                     implements  Gadget{

	public static void main(String[] args) {	
      new Tablet().getPower();
      new Tablet().doStuff();
	}
	public void doStuff() {
		System.out.println("Show book ...");
	};

	

}
