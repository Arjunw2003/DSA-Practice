package com.ArrayPracticeQuestions;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 98, 90, 45 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
