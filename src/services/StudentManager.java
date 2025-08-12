package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import entities.Student;

public class StudentManager {
	private final List<Student> students = new ArrayList<Student>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> searchStudentsByName(String name) {
		String searchName = name.trim().toLowerCase();
		return students.stream().filter(s -> s.getName().toLowerCase().contains(searchName))
				.collect(Collectors.toList());
	}

	public Student searchStudentById(int id) {
		return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
	}

	public boolean updateStudentGrades(int id, double grade1, double grade2) {
		Student s = searchStudentById(id);
		if (s != null) {
			s.setGrade1(grade1);
			s.setGrade2(grade2);
			return true;
		}
		return false;
	}

	public boolean removeStudent(int id) {
		return students.removeIf(s -> s.getId() == id);
	}

	public List<Student> getAllStudents() {
		return Collections.unmodifiableList(students);
	}

	public double calculateClassAverage() {
		if (students.isEmpty())
			return 0;
		return students.stream().mapToDouble(Student::getAverage).average().orElse(0);
	}
}