//strings 2
package video18;

public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bugun hAVa cok guzel.       ";

		System.out.println(mesaj);
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());		
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
