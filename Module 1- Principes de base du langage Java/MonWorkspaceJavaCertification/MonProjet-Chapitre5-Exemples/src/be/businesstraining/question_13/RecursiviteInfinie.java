package be.businesstraining.question_13;

public class RecursiviteInfinie {

	public static void main(String[] args) {
		
		
//		int[] data = {11,22,33,44};
//		
//		for ( final int iter : data) {
//			iter = iter +1;
//			System.out.println(iter);
//		}
		
		final String tt = "OK";
		tt = "KO";
		
		switch ("aze") {
		case tt:
			
			break;

		default:
			break;
		}
		System.out.println("D�but du programme");
		try {
			new RecursiviteInfinie().go();
		} catch (Error e) {
			System.out.println(" Boum STACK OVERFOLW .. "+e.toString());
		}
		System.out.println("Fin du programme");

	}
	
	public void go() {
		
		go();
	}

}
