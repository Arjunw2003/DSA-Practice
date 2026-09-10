package com.ArrayPracticeQuestions;

public class AverageofElements {

	public static void main(String[] args) {

		int[] arr = { 56, 89, 68, 90, 24 };

		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		double average = sum / arr.length;
		System.out.println(average);
	}
}
