package Day3;

public class EvenOrOdd {

	public static void main(String[] args) {

		int[] arr = { 12, 56, 89, 13, 15, 18, 19, 10 };

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even: " + arr[i]);
			} else {
				System.out.println("odd: " + arr[i]);
			}
		}
	}
}
