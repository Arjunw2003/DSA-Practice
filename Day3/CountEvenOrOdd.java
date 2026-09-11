package Day3;

import java.util.Arrays;

public class CountEvenOrOdd {

	public static void main(String[] args) {

		int[] arr = { 12, 56, 89, 13, 15, 18, 19, 10, 14 };

		int Even = 0;
		int odd = 0;

		int EvenIndex = 0;
		int oddIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				Even++;

			} else {
				odd++;
			}
		}

		System.out.println(Even);
		System.out.println(odd);

		int[] EvenNo = new int[Even];
		int[] oddNo = new int[odd];
		
		System.out.println("Even NO: " + Arrays.toString(EvenNo));
		System.out.println("Odd NO: " + Arrays.toString(oddNo));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				EvenNo[EvenIndex] = arr[i];
				EvenIndex++;
			} else {
				oddNo[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		System.out.println("Even NO: " + Arrays.toString(EvenNo));
		System.out.println("Odd NO: " + Arrays.toString(oddNo));

	}

}
