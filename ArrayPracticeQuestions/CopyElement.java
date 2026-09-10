package com.ArrayPracticeQuestions;

public class CopyElement {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 98, 90, 45 };

		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Copy Array: ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
