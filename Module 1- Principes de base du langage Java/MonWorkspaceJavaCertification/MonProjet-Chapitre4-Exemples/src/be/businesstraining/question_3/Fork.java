package be.businesstraining.question_3;

public class Fork {

	public static void main(String[] args) {
		
		String[] data = {"live"};
		
		 if ((data.length == 1) | (data[1].contentEquals("liveRRR"))) 
			 System.out.println("Test case");
		 else
			 System.out.println("Production");
		
		

	}

}
