package Inheritance;

public class Teacher extends Person implements Employable {

	String subject;
	int yearsExperience;

	public Teacher(String n, int a, char g, String subj, int exp) {

		super(n, a, g);
		subject = subj;
		yearsExperience = exp;
	}

	public int getNumOfExperience() {
		return yearsExperience;
	}

	public String getSubject() {
		return subject;
	}

	public String toString() {

		return super.toString() + ", Subject:" + subject + ", Years of Experience:" + yearsExperience;

	}

	public boolean isEmployable() {

		if (super.getAge() > 22 && yearsExperience > 5)
			return true;
		else
			return false;

	}

}
