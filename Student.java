package com.tka.CO;

public class Student {
	int studentId;
	String studentName;
	int age;
	char gender;
	float percentage;
	double attendence;
	double fees;
	String courseName;
	String clgName;
	int rollNo;
	int semester;
	boolean isPassed;
	int grade;
	int addmissionYear;
	
	public void displayStudentDetails() {
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Percentage : "+percentage);
		System.out.println("Attendence : "+attendence);
		System.out.println("Fees : "+fees);
		System.out.println("Course Name : "+courseName);
		System.out.println("College Name : "+clgName);
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Semester : "+semester);
		System.out.println("Is Passed : "+isPassed);
		System.out.println("Grade : "+grade);
		System.out.println("Addmission year : "+addmissionYear);
		
	}
	void checkResult() {
		if(true==true) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	void calculateGrade() {
		if(grade>=80) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
	void checkAttendence() {
		if(attendence>=75) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not eligible");
		}
	}
	

}
