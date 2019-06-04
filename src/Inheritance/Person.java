package Inheritance;

public class Person {
	private String name;
	private int age;
	private char gender;

	public Person(String n, int a, char g) {
		name = n;
		age = a;
		gender = g;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setGender(char g) {
		gender = g;
	}

	public String toString() {
		return name + ", age:" + age + ", gender:" + gender;
	}
}
