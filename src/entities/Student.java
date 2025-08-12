package entities;

public class Student {
	private static int nextId = 1; // counter to generate unique IDs

	private final int id;
	private String name;
	private double grade1;
	private double grade2;

	public Student(String name, double grade1, double grade2) {
		this.id = nextId++;
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getAverage() {
		return (grade1 + grade2) / 2;
	}

	@Override
	public String toString() {
		return String.format("ID: %d | Name: %s | Grades: %.2f, %.2f | Average: %.2f", id, name, grade1, grade2,
				getAverage());
	}
}