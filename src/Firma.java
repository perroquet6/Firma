public class Firma {

	private Tablica lista;

	public Firma() {
		lista = new Tablica();
	}

	public double wyplata(String nazwisko) {
		return znajdzPrac(nazwisko).wyplata();
	}

	public Pracownik znajdzPrac(String nazwisko) {
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (lista.tablicaPracownikow[i].nazwisko.equals(nazwisko)) {
				return lista.tablicaPracownikow[i];
			}
		}
		return null;
	}

	public boolean czyUrzednik(int index) {
		return lista.tablicaPracownikow[index] instanceof Urzednik;
	}

	public void dodajPrac(boolean czyJestUrzednikiem) {
		if (lista.iloscPrac < 6) {
			if (czyJestUrzednikiem) {
				lista.tablicaPracownikow[lista.iloscPrac] = new Urzednik("Malinowski", 1.0, 2500, 10);
			} else {
				lista.tablicaPracownikow[lista.iloscPrac] = new Robotnik("Jab³ecki", 1.5, 150, 10);
			}
			lista.iloscPrac++;
		}
	}

	public void usunPrac(String nazwisko) {
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (lista.tablicaPracownikow[i].nazwisko.equals(nazwisko)) {
				for (int j = 0; j < lista.iloscPrac - i; j++) {
					lista.tablicaPracownikow[i] = lista.tablicaPracownikow[i++];
					// Tu nie mo¿e byæ i++, bo w tym momencie program do tablivy
					// najpierw pobiera wartoœæ i, czyli 3, potem j¹ na sta³e
					// powiêksza, a nie powinien tego robiæ w tym momencie, a
					// tylko w for

				}
			}

		}
		lista.iloscPrac--;
	}

	public int[] iluUrziRob() {
		int iloscU = 0;
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (czyUrzednik(i)) {
				iloscU++;
			}
		}
		int[] tab = { iloscU, lista.iloscPrac - iloscU };
		return tab;
	}

	public double[] sumaWyplat() {
		double sumaWyplatU = 0;
		double sumaWyplatR = 0;
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (czyUrzednik(i)) {
				sumaWyplatU = sumaWyplatU + lista.tablicaPracownikow[i].wyplata();
			} else {
				sumaWyplatR = sumaWyplatR + lista.tablicaPracownikow[i].wyplata();
			}
		}

		double[] tab = { sumaWyplatU, sumaWyplatR };
		return tab;
	}

	public void wydrukListyPrac() {
		System.out.println("Lista pracowników");
		System.out.println("Lp, nazwisko, grupa, etat");
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (czyUrzednik(i)) {
				System.out.println(i++ + ", " + lista.tablicaPracownikow[i].nazwisko + ", " + "Urzêdnik, "
						+ lista.tablicaPracownikow[i].etat);
			} else {
				System.out.println(i++ + ", " + lista.tablicaPracownikow[i].nazwisko + ", " + "Robotnik, "
						+ lista.tablicaPracownikow[i].etat);
			}

		}
	}

	public void wydrukListyU() {
		System.out.println("Lista Urzêdników");
		System.out.println("Lp, nazwisko, etat");
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (czyUrzednik(i)) {
				System.out.println(
						i++ + ", " + lista.tablicaPracownikow[i].nazwisko + ", " + lista.tablicaPracownikow[i].etat);
			}
		}
	}

	public void wydrukListyR() {
		System.out.println("Lista Robotników");
		System.out.println("Lp, nazwisko, etat");
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (czyUrzednik(i)) {
			} else {
				System.out.println(
						i++ + ", " + lista.tablicaPracownikow[i].nazwisko + ", " + lista.tablicaPracownikow[i].etat);
			}
		}
	}

	public void wydrukListyPlac() {
		System.out.println("Lista p³ac");
		System.out.println("Lp, nazwisko, grupa, etat, wyp³ata");
		for (int i = 0; i < lista.iloscPrac; i++) {
			if (czyUrzednik(i)) {
				System.out.println(i++ + ", " + lista.tablicaPracownikow[i].nazwisko + ", " + "Urzêdnik, "
						+ lista.tablicaPracownikow[i].etat + lista.tablicaPracownikow[i].wyplata());
			} else {
				System.out.println(i++ + ", " + lista.tablicaPracownikow[i].nazwisko + ", " + "Robotnik, "
						+ lista.tablicaPracownikow[i].etat + lista.tablicaPracownikow[i].wyplata());
			}

		}
	}
}
