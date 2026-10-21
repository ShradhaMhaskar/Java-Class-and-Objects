package com.tka.CO;

public class MainClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.employeeId = 1324;
		emp.employeeName = "Ram Sharma";
		emp.age = 25;
		emp.salary = 4000.00;
		emp.department = "s/w development";
		emp.designation = "s/w Engineering";
		emp.experience = 4;
		emp.phoneNo = 1341543523;
		emp.email = "ran@gmail.com";
		emp.isPermanent = false;
		emp.isManager = true;
		emp.bonus = 10000f;
		emp.workingHours = 8;
		emp.joiningYear = 2022;
		emp.gender = 'M';
		emp.displayEmployeeDetails();
		emp.anualSalary();
		emp.calculateBonus();
		emp.checkPromotion();
		emp.markAttendence();

		System.out.println("-----------------------------------------------------------------");

		Hospital hos = new Hospital();
		hos.patientId = 31423;
		hos.patientName = "Ram Sharma";
		hos.age = 30;
		hos.gender = 'M';
		hos.temprature = 70f;
		hos.height = 5.67;
		hos.weight = 55;
		hos.bill = 1000;
		hos.bloodGroup = "A";
		hos.displayPatientDetails();
		hos.calculateBill();
		hos.checkPatientStatus();

		System.out.println("--------------------------------------------------------------------");

		Student stud = new Student();
		stud.studentId = 5432;
		stud.studentName = "Priya Sharma";
		stud.age = 21;
		stud.gender = 'F';
		stud.percentage = 85;
		stud.attendence = 65;
		stud.fees = 50000;
		stud.courseName = "BCA";
		stud.clgName = "JGI,Belgaum";
		stud.rollNo = 321244;
		stud.semester = 4;
		stud.isPassed = true;
		stud.grade = 85;
		stud.addmissionYear = 2024;
		stud.displayStudentDetails();
		stud.checkResult();
		stud.calculateGrade();
		stud.checkAttendence();

		System.out.println("------------------------------------------------------------------");

		Library lab = new Library();
		lab.bookId = 12413;
		lab.bookName = "Learning How To Fly";
		lab.authorName = "Dr.A.P.J Abdul Kalam";
		lab.price = 450;
		lab.quantity = 2;
		lab.isAvailable = true;
		lab.isIssued = true;
		lab.bookRating = 4.5f;
		lab.publicationYear = 2013;
		lab.bookCode = 'A';
		lab.displayLibraryDetails();
		lab.checkIssueBook();
		lab.returnBook();
		lab.checkAvailability();
		lab.calculateBookPrice();

		System.out.println("-------------------------------------------------------------------");

		Vehical vcl = new Vehical();
		vcl.vehicalId = 2312;
		vcl.vehicalName = "Thar";
		vcl.brand = "Mahindra";
		vcl.price = 1500000;
		vcl.mileage = 15.0f;
		vcl.speed = 80;
		vcl.modelYear = 2025;
		vcl.fuelType = "Diesel";
		vcl.engineCapacity = 2184;
		vcl.isElectric = false;
		vcl.vehicalType = 'S';
		vcl.displayVehicalDetails();
		vcl.startVehical();
		vcl.calculateMileage();

	}

}
