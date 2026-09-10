package com.ArrayPracticeQuestions;

public class SearchElement {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 98, 90, 45 };

		int search = 15;
		boolean Found = false;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == search) {
				Found = true;
			}
		}
		if (Found) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
