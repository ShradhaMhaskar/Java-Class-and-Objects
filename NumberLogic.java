package com.practice.methods;

public class NumberLogic {
	public void fibonacci() {
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Fibonacci Series : ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}
	

	public void palindrome() {
		int num = 12121;
		int original = num;
		int reverse = 0;

		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;

		}
		if (original == reverse) {
			System.out.println(original + " is palindrome number");
		} else {
			System.out.println(original + " is not palindrome number");
		}
	}
	

	public void reverse() {
		int num = 1234567;
		int temp=num;
		int original = 0;
		int reverse = 0;

		while (num > 0) {
			original = num % 10;
			reverse = reverse * 10 + original;
			num = num / 10;

		}
		System.out.println("Original Number : " + temp);
		System.out.println("Reverse Number : " + reverse);

	}

}
