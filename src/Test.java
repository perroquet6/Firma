
public class Test {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		//1. obliczenie wyp³aty Pracownika
		System.out.println(firma.wyplata("Kowalski"));
		
		//2. znajdŸ pracownika o podanym nazwisku(wynik-referencja)
		System.out.println(firma.znajdzPrac("Nowak"));
		
		//3. czy Pracownik jest Urzêdnikiem (Robotnikiem)
		System.out.println("Pracownik jest Urzêdnikiem: " + firma.czyUrzednik(1));
		
		//4. wpisz Urzêdnika (Robotnika) na listê
		firma.dodajPrac(true);
		
		//5. usuñ z listy Pracownika o danym nazwisku
		firma.usunPrac("Borowski");
		
		//6. ilu jest zatrudnionych Urzêdników (Robotników)
		int[] tab6 = firma.iluUrziRob();
		System.out.println("liczba Urzêdników, liczba Robotników: " + tab6[0] + ", " + tab6[1]);
		
		//7. jaka jest suma wszystkich Urzêdników (Robotników)
		double[] tab7 = firma.sumaWyplat();
		System.out.println("Suma wyp³at Urzêdników, suma wyp³at Robotników: " + tab7[0] + ", " + tab7[1]);
		System.out.println();
		
		//8.wydruk listy pracowników
		firma.wydrukListyPrac();
		System.out.println();
		
		//9. wydruk listy Urzêdników (Robotników)
		firma.wydrukListyU();
		System.out.println();
		firma.wydrukListyR();
		System.out.println();
		
		//10. wydruk listy p³ac
		firma.wydrukListyPlac();
		
		

	}

}
