package com.Day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 24, 65, 12, 24, 69, 90, 12, 56 };

		for (int i = 0; i <= arr.length - 1; i++) {
			boolean Duplicates = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					Duplicates = true;
				}
			}
			if (!Duplicates) {
				System.out.println(arr[i]);
			}
		}
	}

}
