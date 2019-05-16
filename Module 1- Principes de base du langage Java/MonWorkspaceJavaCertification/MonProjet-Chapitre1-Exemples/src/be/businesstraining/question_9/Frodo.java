package be.businesstraining.question_9;

class Hobbit {
	  int countGold(int x, int y) {
		return x+y;
	}
}
public class Frodo  extends Hobbit{
	
	public static void main(String[] args) {
		 int myGold = 7;
		 Frodo frodo = new Frodo();
		 
		System.out.println(frodo.countGold(myGold, 6)); // main should call static methods!

	}

}
