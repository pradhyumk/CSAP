package Inheritance;

public class InheritanceTester {

	private static int getBirthYear(Employable e, int currYr) {

		return currYr - ((Person) e).getAge();

	}

	public static void main(String[] args) {

		// Part 1

		Person jay = new Person("Jay", 35, 'M');
		System.out.println(jay);

		Student amy = new Student("Amy", 15, 'F', "123321", 3.4);
		System.out.println(amy);

		Teacher james = new Teacher("Gosling", 53, 'M', "Computer Science", 35);

		CollegeStudent aaron = new CollegeStudent("Aaron", 18, 'M', "99099", 3.9, "Senior", "Computer Engineering",
				2016);

		// Part 2
		CollegeStudent c3 = new CollegeStudent("Aaron", 18, 'M', "99099", 3.9, "Freshman", "Computer Engineering",
				2016);
		CollegeStudent c1 = new CollegeStudent("Baron", 19, 'M', "19191", 3.9, "Sophomore", "Computer Engineering",
				2016);
		CollegeStudent c2 = new CollegeStudent("Caren", 20, 'F', "54321", 3.9, "Junior", "Computer Engineering", 2016);

		if (c1.compareTo(c2) < 0 && c1.compareTo(c3) < 0) {
			System.out.print(c1.getName() + ", ");
			if (c2.compareTo(c3) < 0) {
				System.out.println(c2.getName() + ", " + c3.getName());
			} else if (c2.compareTo(c3) > 0) {
				System.out.println(c3.getName() + ", " + c2.getName());
			} else
				System.out.println(c2.getName() + ", " + c3.getName());

		}

		else if (c2.compareTo(c1) < 0 && c2.compareTo(c3) < 0) {
			System.out.print(c2.getName() + ", ");
			if (c1.compareTo(c3) < 0) {
				System.out.println(c1.getName() + ", " + c3.getName());
			} else if (c2.compareTo(c3) > 0) {
				System.out.println(c3.getName() + ", " + c1.getName());
			} else
				System.out.println(c2.getName() + ", " + c3.getName());

		}

		else if (c3.compareTo(c1) < 0 && c3.compareTo(c2) < 0) {
			System.out.print(c3.getName() + ", ");
			if (c1.compareTo(c2) < 0) {
				System.out.println(c1.getName() + ", " + c2.getName());
			} else if (c1.compareTo(c2) > 0) {
				System.out.println(c2.getName() + ", " + c1.getName());
			} else
				System.out.println(c1.getName() + ", " + c2.getName());

		}

		// Part 3

		CollegeStudent s = new CollegeStudent("John Smith", 100, 'M', "99099", 1.0, "Freshman", "Computer Engineering",
				2016);

		CollegeStudent s1 = new CollegeStudent("Jane Doe", 18, 'M', "99099", 4.0, "Freshman", "Computer Engineering",
				2016);

		Teacher te = new Teacher("Employable Teacher", 53, 'M', "Computer Science", 35);

		Teacher te1 = new Teacher("Not Employable Teacher", 53, 'M', "Computer Science", 0);

		System.out.println(s.isEmployable());
		System.out.println(s1.isEmployable());
		System.out.println(te.isEmployable());
		System.out.println(te1.isEmployable());

		// Part 4

		Employable c = new CollegeStudent("Jane Doe", 18, 'M', "99099", 4.0, "Freshman", "Computer Engineering", 2016);
		Employable t = new Teacher("Employable Teacher", 53, 'M', "Computer Science", 35);
		System.out.println(((CollegeStudent) c).getName() + ", Birth year: " + getBirthYear(c, 2016));
		System.out.println(((Teacher) t).getName() + ", Birth year: " + getBirthYear(t, 2016));
	}

}
