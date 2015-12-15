

public class Tablica {
	public Pracownik[] tablicaPracownikow;
	int iloscPrac;

	public Tablica() {
		
		iloscPrac = 4;
		tablicaPracownikow = new Pracownik[6];

		
		tablicaPracownikow[0] = new Urzednik("Kowalski", 0.5, 2200, 5);
		tablicaPracownikow[1] = new Urzednik("Nowak", 1.0, 2500, 10);
		tablicaPracownikow[2] = new Robotnik("Kwiatkowski", 1.0, 160, 10);
		tablicaPracownikow[3] = new Robotnik("Borowski", 1.5, 250, 8);
	}
}