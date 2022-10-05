//multidimensional arrays (matrices)
package video16;

public class Main {

	public static void main(String[] args) {
		
		String[][]  turkey = new String[3][3];
		
		turkey[0][0] = "Istanbul";
		turkey[0][1] = "Bursa";
		turkey[0][2] = "Bilecik";
		turkey[1][1] = "Ankara";
		turkey[1][2] = "Konya";
		turkey[1][0] = "Kayseri";
		turkey[2][0] = "Diyarbakır";
		turkey[2][1] = "Şanlıurfa";
		turkey[2][2] = "Gaziantep";
		
		for(String[] district:turkey) {
			System.out.println("---------------");
			for(String city:district) {
				System.out.println(city);
			}
		}
	}

}
