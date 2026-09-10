package com.ArrayPracticeQuestions;

public class MinNo {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 6, 98, 90, 45 };

		int min = arr[0];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum No: " + min);
	}
}
