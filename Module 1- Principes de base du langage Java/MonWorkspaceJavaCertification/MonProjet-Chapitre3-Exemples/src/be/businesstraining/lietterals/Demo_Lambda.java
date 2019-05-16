package be.businesstraining.lietterals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo_Lambda {

	public static void main(String[] args) {
		 List<Integer> data =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
//		 for (Integer nb : data) {
//			if (nb%2==0) {
//				System.out.println(nb);
//				
//			}
//		}
		 
		 //Predicate<Integer> paires = x-> x%2==0;
//		 Predicate<Integer> paires = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t%2==0;
//			}
//		};
		 data.
		     stream().
		     map(z-> 10+z)
		     //.filter(x-> x%2 ==0).
		     .filter( paires).
		     forEach(y-> System.out.println(y));
	}

	

}
