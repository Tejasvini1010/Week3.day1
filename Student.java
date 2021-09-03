package org.student;

//import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("The student name is Tejasvini");
	}
	public void studentDept() {
		System.out.println("The department is Instrumentation");
	}
	public void studentId() {
		System.out.println("The student id is 51808313");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
		stud.deptName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
	
	}
}
