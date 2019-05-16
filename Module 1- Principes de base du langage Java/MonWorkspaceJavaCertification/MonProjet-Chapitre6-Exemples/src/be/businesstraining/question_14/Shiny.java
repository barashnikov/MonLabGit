package be.businesstraining.question_14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Shiny {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.of(2018, 3, 15);
		
		LocalTime t;
		
		LocalDateTime dt;
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		
		System.out.println(d.format(f));
		
		System.out.println(f.format(d));

	}

}
