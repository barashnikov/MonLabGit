package be.businesstraining.question7;

import java.io.IOException;

class ParentException extends Exception {};
class ChildException extends ParentException {};


public class Person {
   public void doStuff() throws ParentException {}
}

class Employee extends Person {
	  public void doStuff() throws ChildException, NullPointerException {}
	  // public void doStuff() throws ChildException, IOException {}  //Compile-time error
	  // public void doStuff() throws Exception {} // Compile-time error

}