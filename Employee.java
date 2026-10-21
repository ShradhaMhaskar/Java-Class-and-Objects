package com.tka.CO;

public class Employee {
	int employeeId;
	String employeeName;
	int age;
	double salary;
	String department;
	String designation;
	int experience;
	int phoneNo;
	String email;
	boolean isPermanent;
	boolean isManager;
	float bonus;
	int workingHours;
	int joiningYear;
	char gender;

	public void displayEmployeeDetails() {
		System.out.println("Employee Id -->" + employeeId);
		System.out.println("Employee Name -->" + employeeName);
		System.out.println("Age -->" + age);
		System.out.println("Salary -->" + salary);
		System.out.println("Department -->" + department);
		System.out.println("Designation -->" + designation);
		System.out.println("Experience -->" + experience);
		System.out.println("Phone Number -->" + phoneNo);
		System.out.println("Email-->" + email);
		System.out.println("Is Permanent-->" + isPermanent);
		System.out.println("Is Manager -->" + isManager);
		System.out.println("Bonus -->" + bonus);
		System.out.println("Working Hour -->" + workingHours);
		System.out.println("Joining Year -->" + joiningYear);
		System.out.println("Gender -->" + gender);

	}

	void anualSalary() {
		System.out.println("Employees salary : " + (salary * 12));

	}

	void calculateBonus() {
		System.out.println("Bonus : " + bonus);
	}

	void checkPromotion() {
		if (experience >= 5) {
			System.out.println("You get promotion");
		} else {
			System.out.println("You will not get promotion");
		}
	}

	void markAttendence() {
		System.out.println("Empoyee attendence marked : ");
	}

}
