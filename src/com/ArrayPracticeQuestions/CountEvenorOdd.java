package com.ArrayPracticeQuestions;

public class CountEvenorOdd {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 98, 90, 45, 4 };

		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}
		System.out.println("Even No: " + even);
		System.out.println("Odd No: " + odd);

	}
}
