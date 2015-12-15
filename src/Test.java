
public class Test {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		//1. obliczenie wyp�aty Pracownika
		System.out.println(firma.wyplata("Kowalski"));
		
		//2. znajd� pracownika o podanym nazwisku(wynik-referencja)
		System.out.println(firma.znajdzPrac("Nowak"));
		
		//3. czy Pracownik jest Urz�dnikiem (Robotnikiem)
		System.out.println("Pracownik jest Urz�dnikiem: " + firma.czyUrzednik(1));
		
		//4. wpisz Urz�dnika (Robotnika) na list�
		firma.dodajPrac(true);
		
		//5. usu� z listy Pracownika o danym nazwisku
		firma.usunPrac("Borowski");
		
		//6. ilu jest zatrudnionych Urz�dnik�w (Robotnik�w)
		int[] tab6 = firma.iluUrziRob();
		System.out.println("liczba Urz�dnik�w, liczba Robotnik�w: " + tab6[0] + ", " + tab6[1]);
		
		//7. jaka jest suma wszystkich Urz�dnik�w (Robotnik�w)
		double[] tab7 = firma.sumaWyplat();
		System.out.println("Suma wyp�at Urz�dnik�w, suma wyp�at Robotnik�w: " + tab7[0] + ", " + tab7[1]);
		System.out.println();
		
		//8.wydruk listy pracownik�w
		firma.wydrukListyPrac();
		System.out.println();
		
		//9. wydruk listy Urz�dnik�w (Robotnik�w)
		firma.wydrukListyU();
		System.out.println();
		firma.wydrukListyR();
		System.out.println();
		
		//10. wydruk listy p�ac
		firma.wydrukListyPlac();
		
		

	}

}
