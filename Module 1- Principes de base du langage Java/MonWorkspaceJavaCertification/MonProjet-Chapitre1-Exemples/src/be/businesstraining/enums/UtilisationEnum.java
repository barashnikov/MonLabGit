package be.businesstraining.enums;

enum Saison {
    HIVER,
    PRINTEMPS,
    ETE,
    AUTOMNE
}

public class UtilisationEnum {

	public static void main(String[] args) {
		Saison saison = Saison.PRINTEMPS;
		System.out.println(saison);
	}
}
