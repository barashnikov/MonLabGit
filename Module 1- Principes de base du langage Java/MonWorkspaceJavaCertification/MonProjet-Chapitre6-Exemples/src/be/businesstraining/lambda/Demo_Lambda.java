package be.businesstraining.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//class MyPredicate  implements Predicate<Integer>{
//
//	@Override
//	public boolean test(Integer t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//}
public class Demo_Lambda {

	public static void main(String[] args) {
		
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		
		
		System.out.println("x = "+ x+ " a = "+ a + " b = "+b + " c = "+c);
		
//		
//		
//
//		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		// Afficher tous les nombres pairs
////		for (Integer nb : data) {
////			if (nb % 2 == 0) {
////				System.out.println(nb);
////			}
////		}
//		StringBuilder sb = new StringBuilder(5);
//        String s  = "";
//        
//        System.out.println(" ====> "+ sb.toString().equals(s.toString()));
//		Predicate<String> pairs = ( String t) ->  true ;
//		
//	//	Predicate<Integer> nouv = (t) -> t %2 ==0;
//		
////		data.
////		    stream().
////		    map (x ->  10+x).
////		    filter(pairs).
////		    forEach(x -> System.out.println(x));		
////		
//		int resultat = 
//		  data.
//		    stream().
//		       mapToInt(x ->x*x).
//		       //sum();
//		      reduce(0, Integer::sum);
//		System.out.println(resultat);
//		    
	}

}
