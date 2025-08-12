# Student Grade Manager

## Overview
Student Grade Manager is a Java console application that allows users to manage students' grades.  
You can add students, search them by name or ID, update their grades, remove them, and calculate the class average — all from an interactive console menu.

## Features
- Add students with automatic ID generation
- List all registered students
- Search students by name (partial match) or by ID
- Update student grades
- Remove students from the system
- Calculate and display the class average grade
- Input validation for grades (0–10) and menu options
- Interactive console menu for easy navigation
- Continuous loop until the program is exited

## Technologies Used
- Java SE (Console Application)
- Object-oriented programming (OOP) with classes and methods
- Basic exception handling
- Java Streams API for filtering and averaging

## Requirements
- Java Development Kit (JDK) version 14 or higher is required to compile and run this project, because it uses the modern switch expression syntax introduced in Java 14.
- To check your Java version, run:
```bash
  javac -version
```
```bash
  java -version
```

## Installation
1. Clone the repository:
```bash
git clone https://github.com/ryanoviski/student_grade_manager.git
```
2. Navigate to the project directory:
```bash
cd student_grade_manager
```
3. Compile the Java files:
```bash
javac -d bin src/application/Main.java src/entities/Student.java src/services/StudentManager.java
```
4. Run the program:
```bash
java -cp bin application/Main
```

## How to Use
- Upon running, you will see a menu with available options.
- Enter the number corresponding to the desired action.
- Provide the requested information (student name, grades, or ID).
- View results or confirmation messages in the console.
- The program will keep running until you choose to exit (option 0).

## Contributions
Contributions are welcome! Feel free to open issues or pull requests.

## License
This project is licensed under the MIT License (LICENSE).

## Contact
Ryan dos Santos — ryanoviski@gmail.com  
GitHub: [https://github.com/ryanoviski](https://github.com/ryanoviski)
