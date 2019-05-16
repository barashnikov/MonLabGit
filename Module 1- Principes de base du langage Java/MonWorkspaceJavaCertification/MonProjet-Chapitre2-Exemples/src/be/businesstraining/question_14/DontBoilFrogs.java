package be.businesstraining.question_14;

interface FrogBoilable {
	static int getCtoF(int cTemp) {
		return (cTemp * 9 / 5) + 32;
	}
	default String hop() {
		return "hopping";
	}
}

public class DontBoilFrogs implements FrogBoilable {
	public static void main(String[] args) {
       new DontBoilFrogs().go(); 
	}
	void go() {
		System.out.println(hop());    // No problem ...
		//System.out.println(getCtoF(100));
		System.out.println(FrogBoilable.getCtoF(100));
		
		DontBoilFrogs dbf = new DontBoilFrogs();
		
		System.out.println(FrogBoilable.getCtoF(100));
		System.out.println(dbf.hop());
	}
}
