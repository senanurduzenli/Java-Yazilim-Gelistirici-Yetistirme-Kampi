//mini project 4 - friend numbers
package video22;

public class Main {

	public static void main(String[] args) {
		// 220-284
		int num1 = 222;
		int num2 = 284;
		int sum1 = 0;
		int sum2 = 0;
		int remainder;

		// num1
		for (int i = 1; i < num1; i++) {
			remainder = num1 % i;
			if (remainder == 0) {
				sum1 += i;
			}
		}

		// num2
		for (int j = 1; j < num2; j++) {
			remainder = num2 % j;
			if (remainder == 0) {
				sum2 += j;
			}
		}

		// output
		if (sum1 == num2 && sum2 == num1) {
			System.out.println(num1 + " and " + num2 + " are friend numbers.");
		} else {
			System.out.println(num1 + " and " + num2 + " are not friend numbers.");
		}

	}

}
