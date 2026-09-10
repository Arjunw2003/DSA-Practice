package com.Day1;

public class FindLargestEle {

	public static void main(String[] args) {
		int[] arr = { 12, 90, 60, 80, 56, 92, 70 };
		int large = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println("Largest Element: " + large);
	}
}
