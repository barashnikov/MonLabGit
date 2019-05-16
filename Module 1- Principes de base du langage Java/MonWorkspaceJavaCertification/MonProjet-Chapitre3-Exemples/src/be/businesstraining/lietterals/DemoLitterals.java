package be.businesstraining.lietterals;

public class DemoLitterals {

	private static final int MAX = 10;

	public static void main(String[] args) {

		int i = 123;

		long l = 123L;

		int octal = 012;

		int hexa = 0x80000000;

		System.out.println(hexa);

		double reel = 123.4;

		float flottant = 1234.6F;

	}

	void demoScopes() {

		
		if (MAX >= 1) {
			 int i = 10;
			 
			
		}
		
//		for (int i = 0; i < array.length; i++) {
//			
//		}
		
		 if (MAX >10) {
				int i = 20;
			}

		

		
	}

}
