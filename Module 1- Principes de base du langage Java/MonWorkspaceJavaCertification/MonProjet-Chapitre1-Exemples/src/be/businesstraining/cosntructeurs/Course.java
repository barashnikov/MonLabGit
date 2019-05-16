package be.businesstraining.cosntructeurs;

public class Course {
	
	private String title;

	// Constructeur par défaut (Sans argument)
	public Course() {
	}

	// Constructeur avec arguments
	public Course(String title) {
		this.title = title;
	}
	
	public static void main(String[] args) {
		Course course =  new Course();	
		Course course2 = new Course("Java OCA Exam");
	}
	

}
