package com.ArrayPracticeQuestions;

public class Demo {

	public static void main(String[] args) {

		int[] arr = { 90, 20, 67, 12, 89, 45 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		System.out.println("Largest Element = " + largest);
		System.out.println("Second Largest Element = " + secondLargest);
	}
}
