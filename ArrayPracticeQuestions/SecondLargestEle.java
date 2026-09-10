package com.ArrayPracticeQuestions;

//Array write a Java program to find the second largest element in an integer array without sorting the array.

public class SecondLargestEle {

	public static void main(String[] args) {

		int[] arr = { 9, 84, 7, 12, 89, 45 };
		int larg = 0;
		int slarg = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] >= larg) {
				larg = arr[i];
			}
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > slarg && arr[i] < larg) {
				slarg = arr[i];
			}
		}
		System.out.println(slarg);

	}
}
