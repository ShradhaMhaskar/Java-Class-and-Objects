package com.tka.CO;

public class Hospital {
	int patientId;
	String patientName;
	int age;
	char gender;
	float temprature;
	double height;
	double weight;
	double bill;
	String bloodGroup;

	public void displayPatientDetails() {
		System.out.println("Patient Id : " + patientId);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Temprature : " + temprature);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + weight);
		System.out.println("Bill : " + bill);
		System.out.println("Blood Group : " + bloodGroup);

	}

	void calculateBill() {
		System.out.println("Hospital bill");
	}
	void checkPatientStatus() {
		System.out.println("Discharged");
	}
}