package com.ArrayPracticeQuestions;

public class ShortAsendingArray {

	public static void main(String[] args) {

		int[] arr = { 97, 45, 67, 98, 90, 40 };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(arr[i]);
		}

	}
}
