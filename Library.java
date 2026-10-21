package com.tka.CO;

public class Library {
	int bookId;
	String bookName;
	String authorName;
	double price;
	int quantity;
	boolean isAvailable;
	boolean isIssued;
	float bookRating;
	int publicationYear;
	char bookCode;

	public void displayLibraryDetails() {
		System.out.println("book ID-->" + bookId);
		System.out.println("book Name-->" + bookName);
		System.out.println("Author Name-->" + authorName);
		System.out.println("Book price-->" + price);
		System.out.println("Quantity-->" + quantity);
		System.out.println("Is Available-->" + isAvailable);
		System.out.println("Is Issued-->" + isIssued);
		System.out.println("Book Rating-->" + bookRating);
		System.out.println("Publication Year-->" + publicationYear);
		System.out.println("Book Code-->" + bookCode);

	}

	void checkIssueBook() {
		System.out.println("Issued Book");
	}

	void returnBook() {
		System.out.println("Not return");
	}

	void checkAvailability() {
		if (isAvailable == true) {
			System.out.println("Book available");
		} else {
			System.out.println("No book available");
		}
	}

	void calculateBookPrice() {
		System.out.println("Book price--->" + (price * quantity));
	}

}
