//mini project 2 - sesli kalin harf
package video20;

public class Main {

	public static void main(String[] args) {
		char harf = 'W';
		boolean bulundu = false;

		char[] kalin = { 'A', 'I', 'O', 'U' };
		char[] ince = { 'E', 'İ', 'Ö', 'Ü' };

		for (char k : kalin) {
			if (harf == k) {
				System.out.println(harf + " harfi kalın bir harf.");
				bulundu = true;
			}
		}
		for (char i : ince) {
			if (harf == i) {
				System.out.println(harf + " harfi ince bir harf.");
				bulundu = true;
			}
		}

		if (bulundu == false) {
			System.out.println(harf + " sesli bir harf degil.");
		}

	}

}
