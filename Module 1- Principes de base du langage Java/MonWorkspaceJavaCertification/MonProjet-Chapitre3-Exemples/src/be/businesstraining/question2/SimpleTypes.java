package be.businesstraining.question2;

public class SimpleTypes {

	public static void main(String[] args) {
		
		int i= 123;
		long l =1234L;
		int j = (int)1234L;
		
		byte b1 =  127; // Ok puisque 127 tient sur [-128,127]
		//byte b1 = (byte) 129; va nous faire perdre deux element
		// faire taire le compliteur
		short s1 = 32767;
		short s2=(short)32768;
		
		double d1= 123.45;
		float f1=123.45F;
		float f2 =(float) 12345.6;
		
		int ii1 = (int)123.82;
		System.out.println(ii1);
		
	}

}
