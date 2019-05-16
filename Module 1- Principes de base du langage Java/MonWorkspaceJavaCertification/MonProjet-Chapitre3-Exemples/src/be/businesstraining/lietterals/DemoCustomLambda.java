package be.businesstraining.lietterals;

public class DemoCustomLambda {

	public static void main(String[] args) {
		Calcul calcul = new Calcul() {
			
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		Calcul c1 = (a,b)-> a+b ;
		Calcul c2 = (a,b)-> a*b ;
		Calcul c3 = (a,b)-> a/b ;
	}
	
	public static int doSomeCalcul(Calcul op,int x,int y)){
		return op.operation(x, y);
	}

}
