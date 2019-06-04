package Inheritance;

public class CollegeStudent extends Student implements Comparable<CollegeStudent>, Employable {

	int projectedYearOfGraduation;
	String year;
	String major;

	public CollegeStudent(String n, int age, char gender, String ID, double gpa, String y, String m, int grad) {

		super(n, age, gender, ID, gpa);

		projectedYearOfGraduation = grad;

		year = y;

		major = m;

	}

	public String getMajor() {
		return major;
	}

	public String getYear() {
		return year;
	}

	public int getYearOfGrad() {
		return projectedYearOfGraduation;
	}

	public String toString() {

		return super.toString() + ", Year:" + year + ", Major:" + major + ", Year of Graduation:"
				+ projectedYearOfGraduation;

	}

	public int compareTo(CollegeStudent o) {

		return super.getName().compareTo(o.getName());

	}

	public boolean isEmployable() {

		if ((super.getAge() >= 18 && super.getAge() <= 22) && super.getGPA() > 2.5) {
			return true;
		} else
			return false;

	}
}
