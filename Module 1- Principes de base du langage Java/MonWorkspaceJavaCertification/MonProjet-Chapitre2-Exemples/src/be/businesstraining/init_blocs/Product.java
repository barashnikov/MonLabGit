package be.businesstraining.init_blocs;

import java.util.ArrayList;

public class Product {
	
	private int code;
	private boolean available;
	private char category;
	private ArrayList<String> data;

	
	public static void main(String[] args) {
		
		System.out.println(new Product());
	}


	@Override
	public String toString() {
		return "Product [code=" + code + ", available=" + available + ", category=" + category + ", data=" + data + "]";
	}





	
	
}
