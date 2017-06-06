package test;

public class Test {
	public static void main(String[] args) {
		int[] test = { 1, 2, -1, 2, 2 };
		// System.out.println(is235Array(test));
		// System.out.println(closestFibonacci(3));
		System.out.println(isOlympic(test));
	}

	// wei zhang logged on
	// Applicant ID: 245701
	// password: Programming
	public static int isOlympic(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				return 0;
			}
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] < a[i]) {
					sum += a[j];
				}
			}
			if (sum > a[i]) {
				return 0;
			}
		}
		return 1;
	}

	public static int closestFibonacci(int n) {
		if (n < 1) {
			return 0;
		}
		int a = 1;
		int b = 1;
		int c = 0;
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;
	}

	// 1. An array is defined to be a 235 array if the number of elements
	// divisible by 2 plus the number of elements divisible by 3 plus the number
	// of elements divisible by 5 plus the number of elements not divisible by
	// 2, 3, or 5 is equal to the number of elements of the array. Write a
	// method named is123Array that returns 1 if its array argument is a 235
	// array, otherwise it returns 0.
	public static int is235Array(int[] a) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			if (j % 2 == 0) {
				res += 1;
			}
			if (j % 3 == 0) {
				res += 1;
			}
			if (j % 5 == 0) {
				res += 1;
			}
			if ((j % 2 != 0) && (j % 3 != 0) && (j % 5 != 0)) {
				res += 1;
			}
		}
		if (res == a.length) {
			return 1;
		} else {
			return 0;
		}
	}
}
