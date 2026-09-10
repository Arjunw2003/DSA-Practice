package com.Day1;

public class FindSecondLargestElement {

	public static void main(String[] args) {

		int[] arr = { 12, 90, 89, 80, 56, 42, 70 };
		int large = 0;
		int seclarge = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		for (int j = 0; j <= arr.length - 1; j++) {
			if (arr[j] > seclarge && arr[j] < large) {
				seclarge = arr[j];
			}
		}
		System.out.println("Second Largest Element: " + seclarge);
	}
}
