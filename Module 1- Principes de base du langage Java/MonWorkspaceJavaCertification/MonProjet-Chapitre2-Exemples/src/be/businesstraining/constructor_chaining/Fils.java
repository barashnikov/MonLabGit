package be.businesstraining.constructor_chaining;

class GrandParent {
	
	public GrandParent() {
		System.out.println(" ****** Dans le constructeur du GRAND PARENT");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Grand parend dead");
	}
}
class Parent extends GrandParent{	
	public Parent() {
		System.out.println(" ====== Dans le constructeur du PARENT");
	}
}
public class Fils  extends Parent{
	public Fils() {	
		System.out.println(" >>>>>> Dans le constructeur du FILS");
	}
	public static void main(String[] args) {
        new Fils();
        
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Grand parend dead");
	}
}
