package be.businesstraining.parameter_passing;

public class DemoExchange_Simple {

	static void exchange(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("Dans Echange: " + a+ "  "+ b);
	}

	public static void main(String[] args) {
		int x = 11;
		int y = 22;
		exchange(x, y); 
		System.out.println("x = "+x + " y = "+y);

	}

}
