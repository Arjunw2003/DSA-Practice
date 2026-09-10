package com.ArrayPracticeQuestions;

public class MaxNo {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 10, 98, 90, 45 };

		int max = arr[0];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest No: " + max);

	}
}
