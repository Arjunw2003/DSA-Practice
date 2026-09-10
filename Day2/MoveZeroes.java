package com.Day2;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 0, 5, 2, 0, 79, 7, 0, 9 };
		int[] arr1 = new int[arr.length];
		int arr2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				arr1[arr2] = arr[i];
				arr2++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}