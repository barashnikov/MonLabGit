package be.businesstraining.lietterals;

public class DemoArraysAvecCreux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = new int[5];
		tab[0] = 10;
		tab[1]= 20;
		tab[4] = 50;
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("tab ["+i+ "] contient : " +tab[i]);
		}

	}

}
