
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
		

	}

}
