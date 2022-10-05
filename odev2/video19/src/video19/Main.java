//mini project 1 - prime numbers
package video19;

public class Main {

	public static void main(String[] args) {

		int number = 0;
		boolean isPrime = true;
		int remainder;

		if (number < 1) {
			System.out.println("Invalid number.");
			return;
		}

		if (number == 1) {
			System.out.println("1 is not a prime number");
			return;
		}

		for (int i = 2; i < number; i++) {
			System.out.println(i);
			remainder = number % i;
			if (remainder == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

}
