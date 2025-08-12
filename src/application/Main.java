package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import services.StudentManager;

public class Main {

	private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	private static final StudentManager studentManager = new StudentManager();

	public static void main(String[] args) {

	}

	private static void printMenu() {
		System.out.println("\n--- STUDENT GRADE MANAGER ---");
		System.out.println("1 - Add a new student");
		System.out.println("2 - List all students");
		System.out.println("3 - Search student by name");
		System.out.println("4 - Search student by ID");
		System.out.println("5 - Update student grades");
		System.out.println("6 - Remove a student");
		System.out.println("7 - Calculate class average");
		System.out.println("0 - Exit");
	}

	private static void addStudent() {
		System.out.print("\nEnter student's name: ");
		String name = scanner.nextLine().trim();

		double grade1 = readDouble("Enter grade 1: ");
		double grade2 = readDouble("Enter grade 2: ");

		Student student = new Student(name, grade1, grade2);
		studentManager.addStudent(student);
		System.out.println("Student added with ID: " + student.getId());
	}

	private static void listStudents() {
		List<Student> students = studentManager.getAllStudents();
		if (students.isEmpty()) {
			System.out.println("No students registered.");
			return;
		}
		students.forEach(System.out::println);
	}

	private static void searchStudentByName() {
		System.out.print("\nEnter student name to search: ");
		String name = scanner.nextLine();

		List<Student> students = studentManager.searchStudentsByName(name);
		if (students.isEmpty()) {
			System.out.println("No students found with that name.");
		} else {
			System.out.println("Search results: ");
			students.forEach(System.out::println);
		}
	}

	private static void searchStudentById() {
		int id = readInt("\nEnter the student ID to search: ");

		Student student = studentManager.searchStudentById(id);
		if (student == null) {
			System.out.println("No student found with that ID.");
		} else {
			System.out.println("Search result: ");
			System.out.println(student);
		}
	}

	private static void updateStudentGrades() {
		int id = readInt("\nEnter the student ID to update: ");
		double grade1 = readDouble("Enter new grade 1: ");
		double grade2 = readDouble("Enter new grade 2: ");

		boolean updated = studentManager.updateStudentGrades(id, grade1, grade2);

		if (updated) {
			System.out.println("Grades updated successfully.");
		} else {
			System.out.println("Student ID not found.");
		}
	}

	private static void removeStudent() {
		int id = readInt("\nEnter the student ID to remove: ");

		boolean removed = studentManager.removeStudent(id);
		if (removed) {
			System.out.println("Student removed sucessfully.");
		} else {
			System.out.println("Student ID not found.");
		}
	}

	private static void calculateClassAverage() {
		double average = studentManager.calculateClassAverage();
		System.out.printf("Class average grade: %.2f", average);
	}

	// Helper methods for input
	private static int readInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			return Integer.parseInt(scanner.nextLine());
		}
	}

	private static double readDouble(String prompt) {
		while (true) {
			System.out.print(prompt);
			return Double.parseDouble(scanner.nextLine());
		}
	}
}
