package be.businesstraining.arrays;

import java.util.ArrayList;

public class DemoArrayAvecCreux {

	public static void main(String[] args) {
		
		
		int[] tab = new int[5];
		tab[0]= 10;
		tab[1] = 20;
		// Creux initialiés à 0
		tab[4]= 50;
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("tab["+i+ "] contient : "+ tab[i]);
		}
	}

}
