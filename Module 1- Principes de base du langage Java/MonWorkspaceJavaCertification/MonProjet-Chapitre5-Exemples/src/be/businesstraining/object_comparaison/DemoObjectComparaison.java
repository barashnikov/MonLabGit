package be.businesstraining.object_comparaison;

import java.util.ArrayList;

import java.lang.Math;
import static java.lang.Math.*;

class Product {
	
	public void s2 () throws NullPointerException{
	  ArrayList<E>
		
		Math.sqrt(91);
	
	}
	public void s3 () throws Exception{
	    throw new Exception();
	}

	String name;

	public Product(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class DemoObjectComparaison {
	public static void main(String[] args) {
        Product p = getProduct();
        
        p.s2();
        
	}

	private static Product getProduct() {
		
		return null;
	}

}
