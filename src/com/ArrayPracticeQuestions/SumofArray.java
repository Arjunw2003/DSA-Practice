package com.ArrayPracticeQuestions;

public class SumofArray {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 98, 90, 45 };

		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of Array: " + sum);
	}
}
