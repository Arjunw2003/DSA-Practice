package com.ArrayPracticeQuestions;


public class DuplicateElementRemove {

	public static void main(String[] args) {

		int[] arr = { 12, 56, 78, 89, 90, 12, 78 };
		int[] arr2 = { 17, 56, 78, 97 };

		int[] arr3 = new int[arr.length + arr2.length];

		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr.length + i] = arr2[i];

		}

		for (int i = 0; i < arr3.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr3[i] == arr3[j]) {
					duplicate = true;
				}
			}
			if (!duplicate) {
				System.out.println(arr3[i]);
			}
		}
	}
}
