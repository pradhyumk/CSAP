package Inheritance;

public class Student extends Person {
	private String stuID;
	private double stuGPA;

	public Student(String n, int age, char gender, String ID, double gpa) {
		super(n, age, gender);
		stuID = ID;
		stuGPA = gpa;
	}

	public String getIDNum() {
		return stuID;
	}

	public double getGPA() {
		return stuGPA;
	}

	public void setIDNum(String ID) {
		stuID = ID;
	}

	public String toString() {
		return super.toString() + ", Student ID:" + stuID + ", stuGPA:" + stuGPA;

	}

}
