package be.businesstraining.question_26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDate date3 = LocalDate.parse("2014-06-02", DateTimeFormatter.ISO_DATE);
		System.out.println(date3);

	}

}
