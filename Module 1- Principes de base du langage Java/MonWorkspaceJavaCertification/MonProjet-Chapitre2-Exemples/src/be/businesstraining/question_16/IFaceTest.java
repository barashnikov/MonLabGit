package be.businesstraining.question_16;

interface MyInterface {
	default int doStuff() {
		return 42;
	}
}

class SomeSuperClass {
	int doStuff() {
		return 1000;
	}
}

public class IFaceTest  extends SomeSuperClass
                     implements MyInterface {

	public static void main(String[] args) {
        new IFaceTest().go();
	}
	
	 void go() {
		System.out.println(super.doStuff());
		System.out.println(MyInterface.super.doStuff());
		System.out.println(doStuff());
		
	}

	public int doStuff() {
		return 43;
	}

}
