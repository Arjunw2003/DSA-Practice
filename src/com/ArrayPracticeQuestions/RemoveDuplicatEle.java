package com.ArrayPracticeQuestions;


//Write a Java program to remove the duplicate elements from an integer array and display only the unique elements.
public class RemoveDuplicatEle {

	public static void main(String[] args) {

		int[] arr = { 12, 50, 89, 12, 78, 90, 54, 89, 50 };

		for (int i = 0; i <= arr.length - 1; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
				}
			}
			if (!duplicate) {
				System.out.println(arr[i]);
				
			}
		}
	}
}
