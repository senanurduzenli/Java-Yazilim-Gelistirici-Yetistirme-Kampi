package intro;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello World!"); 
		
		// degisken isimlendirmeleri java'da camelCase yazilir
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade suresi";
		
		System.out.println(ortaMetin);
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.14;
		
		String okYonu = "";

		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun>dolarDun) { 
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		// array
		
		String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan Alanlar", "Mutlu Emekli"};
		
		
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
	}

}
